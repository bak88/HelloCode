int count = 0;
int distance = 100000;
int firstFriendSpeed = 1;
int secondFriendspeed = 2;
int dogSpeed = 5;
int friend = 2;
int time;

while (distance > 10)
{
    if (friend == 1)
    {
        time = distance / (firstFriendSpeed + dogSpeed);
        friend = 2;
    } else
    {
        time = distance / (secondFriendspeed + dogSpeed);
        friend = 1;
    }

    distance = distance - (firstFriendSpeed + secondFriendspeed) * time;
    count++;
}
Console.WriteLine("собака пробежит " + count + " раз");