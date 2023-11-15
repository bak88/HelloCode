Console.Write("Введите имя пользователя: ");
string username = Console.ReadLine();
  
if(username.ToLower() == "jon"){
    Console.WriteLine("ура это же Jon!");
} else {
    Console.Write("Привет! ");
    Console.WriteLine(username);
}
