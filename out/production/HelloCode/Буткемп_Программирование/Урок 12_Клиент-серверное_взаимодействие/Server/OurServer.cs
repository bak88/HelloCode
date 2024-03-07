using System.Net.Sockets;
using System.Text;

namespace Server
{
    class OurServer
    {
        TcpListener server;

        public OurServer()
        {
            server = new TcpListener(IPAddress.Parse("127.0.0.1"), 5555);
            server.Start();

            void LoopClients()
            {
                while (true)
                {
                    TcpClient client = server.AcceptTcpClient();

                    Thread thread = new Thread(() -> HandleClient(client));
                    thread.Start();


                }
            }

            void HandleClient(TcpClient client)
            {
                StreamReader sReader = new StreamReader(client.GetStream(), Encoding.UTF8);

                while (true)
                {
                    string message = sReader.ReadLine();
                    System.Console.WriteLine($"Клиент написал - {message}");
                }
            }
        }
    }
}