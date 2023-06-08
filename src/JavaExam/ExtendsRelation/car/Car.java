package car;

public class Car {
    Engine engine;
    String modelName;

    public Car() {

    }

    public Car(Engine engine, String modelName) {
        this.engine = engine;
        this.modelName = modelName;
        // TODO Auto-generated constructor stub
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", modelName=" + modelName + "]";
    }


}