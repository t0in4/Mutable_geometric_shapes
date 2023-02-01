Мы пишем движок геометрии. В нем сейчас есть классы Circle, Rectangle, и интерфейсы Movable и Scalable

Нам надо:

    - написать новый интерфейс MutableShape который расширяет оба сущестующих интерфейса
    - представить новый интерфейс в каждом классе
    - переписать методы move и scale в обоих классах:
        scale должен умножить радиус круга на определенный фактор
        scale должен умножить ширину и высоту прямоугольника на определенный фактор
        move должен прибавить dx и dy к центру круга
        move должен прибавить dx и dy к левому верхнему углу прямоугольника
        ( xP = [1 2 2 1];
        yP = [3 1 3 1];

        [~,right] = max(xP);
        [~,left]  = min(xP);
        [~,up]    = max(xP);
        [~,low]   = min(yP);


        upperleft  = intersect(up,left);
        lowerright = intersect(low,right); )

        If center is (x,y) width = w height = h

        Assuming the rectangle is sitting flat relative to the coordinate plane, the upper left corner is exactly (x-w/2, y-h/2).



После наших измений, следующий код должен скомпилироваться

MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);

circle.move(10.1f, 20.2f);
circle.scale(2.2f);

((Circle) circle).getRadius();

