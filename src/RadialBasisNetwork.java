import java.util.List;

public class RadialBasisNetwork extends NeuralNetwork {

    private int gaussiasnFunctions;
    private IActivationFunction activationFunction;

    public RadialBasisNetwork(int inputs, int outputs, int gaussianFunctions, IActivationFunction activationFunction) {
        super(inputs, outputs);
        this.gaussiasnFunctions = gaussianFunctions;
        this.activationFunction = activationFunction;
    }

    @Override
    public void train(List<Sample> samples) {

    }

    @Override
    public Double[] approximate(Double[] inputs) {
        return new Double[inputs.length];
    }

    //get mean of cluster
    public double getMean(){
        return 0.0;
    }
}
