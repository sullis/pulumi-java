// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IterationResultResponse {
    /**
     * @return Time taken to run the iteration in milliseconds.
     * 
     */
    private final String durationMs;
    /**
     * @return Loss computed on the eval data at the end of iteration.
     * 
     */
    private final Double evalLoss;
    /**
     * @return Index of the iteration, 0 based.
     * 
     */
    private final Integer index;
    /**
     * @return Learn rate used for this iteration.
     * 
     */
    private final Double learnRate;
    /**
     * @return Loss computed on the training data at the end of iteration.
     * 
     */
    private final Double trainingLoss;

    @CustomType.Constructor
    private IterationResultResponse(
        @CustomType.Parameter("durationMs") String durationMs,
        @CustomType.Parameter("evalLoss") Double evalLoss,
        @CustomType.Parameter("index") Integer index,
        @CustomType.Parameter("learnRate") Double learnRate,
        @CustomType.Parameter("trainingLoss") Double trainingLoss) {
        this.durationMs = durationMs;
        this.evalLoss = evalLoss;
        this.index = index;
        this.learnRate = learnRate;
        this.trainingLoss = trainingLoss;
    }

    /**
     * @return Time taken to run the iteration in milliseconds.
     * 
     */
    public String durationMs() {
        return this.durationMs;
    }
    /**
     * @return Loss computed on the eval data at the end of iteration.
     * 
     */
    public Double evalLoss() {
        return this.evalLoss;
    }
    /**
     * @return Index of the iteration, 0 based.
     * 
     */
    public Integer index() {
        return this.index;
    }
    /**
     * @return Learn rate used for this iteration.
     * 
     */
    public Double learnRate() {
        return this.learnRate;
    }
    /**
     * @return Loss computed on the training data at the end of iteration.
     * 
     */
    public Double trainingLoss() {
        return this.trainingLoss;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IterationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String durationMs;
        private Double evalLoss;
        private Integer index;
        private Double learnRate;
        private Double trainingLoss;

        public Builder() {
    	      // Empty
        }

        public Builder(IterationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationMs = defaults.durationMs;
    	      this.evalLoss = defaults.evalLoss;
    	      this.index = defaults.index;
    	      this.learnRate = defaults.learnRate;
    	      this.trainingLoss = defaults.trainingLoss;
        }

        public Builder durationMs(String durationMs) {
            this.durationMs = Objects.requireNonNull(durationMs);
            return this;
        }
        public Builder evalLoss(Double evalLoss) {
            this.evalLoss = Objects.requireNonNull(evalLoss);
            return this;
        }
        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        public Builder learnRate(Double learnRate) {
            this.learnRate = Objects.requireNonNull(learnRate);
            return this;
        }
        public Builder trainingLoss(Double trainingLoss) {
            this.trainingLoss = Objects.requireNonNull(trainingLoss);
            return this;
        }        public IterationResultResponse build() {
            return new IterationResultResponse(durationMs, evalLoss, index, learnRate, trainingLoss);
        }
    }
}
