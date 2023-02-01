package geometric;

final class Circle {
    /**
     * Defines the horizontal position of the center of the circle
     */
    private float centerX;

    /**
     * Defines the vertical position of the center of the circle
     */
    private float centerY;

    /**
     * Defines the radius of the circle
     */
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }


}
