// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPredictionModelStatusResult {
    /**
     * @return The model status message.
     * 
     */
    private final String message;
    /**
     * @return Version of the model.
     * 
     */
    private final String modelVersion;
    /**
     * @return The prediction GUID ID.
     * 
     */
    private final String predictionGuidId;
    /**
     * @return The prediction name.
     * 
     */
    private final String predictionName;
    /**
     * @return The signals used.
     * 
     */
    private final Integer signalsUsed;
    /**
     * @return Prediction model life cycle.  When prediction is in PendingModelConfirmation status, it is allowed to update the status to PendingFeaturing or Active through API.
     * 
     */
    private final String status;
    /**
     * @return The hub name.
     * 
     */
    private final String tenantId;
    /**
     * @return Count of the test set.
     * 
     */
    private final Integer testSetCount;
    /**
     * @return The training accuracy.
     * 
     */
    private final Integer trainingAccuracy;
    /**
     * @return Count of the training set.
     * 
     */
    private final Integer trainingSetCount;
    /**
     * @return Count of the validation set.
     * 
     */
    private final Integer validationSetCount;

    @CustomType.Constructor
    private GetPredictionModelStatusResult(
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("modelVersion") String modelVersion,
        @CustomType.Parameter("predictionGuidId") String predictionGuidId,
        @CustomType.Parameter("predictionName") String predictionName,
        @CustomType.Parameter("signalsUsed") Integer signalsUsed,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("testSetCount") Integer testSetCount,
        @CustomType.Parameter("trainingAccuracy") Integer trainingAccuracy,
        @CustomType.Parameter("trainingSetCount") Integer trainingSetCount,
        @CustomType.Parameter("validationSetCount") Integer validationSetCount) {
        this.message = message;
        this.modelVersion = modelVersion;
        this.predictionGuidId = predictionGuidId;
        this.predictionName = predictionName;
        this.signalsUsed = signalsUsed;
        this.status = status;
        this.tenantId = tenantId;
        this.testSetCount = testSetCount;
        this.trainingAccuracy = trainingAccuracy;
        this.trainingSetCount = trainingSetCount;
        this.validationSetCount = validationSetCount;
    }

    /**
     * @return The model status message.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Version of the model.
     * 
     */
    public String modelVersion() {
        return this.modelVersion;
    }
    /**
     * @return The prediction GUID ID.
     * 
     */
    public String predictionGuidId() {
        return this.predictionGuidId;
    }
    /**
     * @return The prediction name.
     * 
     */
    public String predictionName() {
        return this.predictionName;
    }
    /**
     * @return The signals used.
     * 
     */
    public Integer signalsUsed() {
        return this.signalsUsed;
    }
    /**
     * @return Prediction model life cycle.  When prediction is in PendingModelConfirmation status, it is allowed to update the status to PendingFeaturing or Active through API.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The hub name.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Count of the test set.
     * 
     */
    public Integer testSetCount() {
        return this.testSetCount;
    }
    /**
     * @return The training accuracy.
     * 
     */
    public Integer trainingAccuracy() {
        return this.trainingAccuracy;
    }
    /**
     * @return Count of the training set.
     * 
     */
    public Integer trainingSetCount() {
        return this.trainingSetCount;
    }
    /**
     * @return Count of the validation set.
     * 
     */
    public Integer validationSetCount() {
        return this.validationSetCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPredictionModelStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;
        private String modelVersion;
        private String predictionGuidId;
        private String predictionName;
        private Integer signalsUsed;
        private String status;
        private String tenantId;
        private Integer testSetCount;
        private Integer trainingAccuracy;
        private Integer trainingSetCount;
        private Integer validationSetCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPredictionModelStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.modelVersion = defaults.modelVersion;
    	      this.predictionGuidId = defaults.predictionGuidId;
    	      this.predictionName = defaults.predictionName;
    	      this.signalsUsed = defaults.signalsUsed;
    	      this.status = defaults.status;
    	      this.tenantId = defaults.tenantId;
    	      this.testSetCount = defaults.testSetCount;
    	      this.trainingAccuracy = defaults.trainingAccuracy;
    	      this.trainingSetCount = defaults.trainingSetCount;
    	      this.validationSetCount = defaults.validationSetCount;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = Objects.requireNonNull(modelVersion);
            return this;
        }
        public Builder predictionGuidId(String predictionGuidId) {
            this.predictionGuidId = Objects.requireNonNull(predictionGuidId);
            return this;
        }
        public Builder predictionName(String predictionName) {
            this.predictionName = Objects.requireNonNull(predictionName);
            return this;
        }
        public Builder signalsUsed(Integer signalsUsed) {
            this.signalsUsed = Objects.requireNonNull(signalsUsed);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder testSetCount(Integer testSetCount) {
            this.testSetCount = Objects.requireNonNull(testSetCount);
            return this;
        }
        public Builder trainingAccuracy(Integer trainingAccuracy) {
            this.trainingAccuracy = Objects.requireNonNull(trainingAccuracy);
            return this;
        }
        public Builder trainingSetCount(Integer trainingSetCount) {
            this.trainingSetCount = Objects.requireNonNull(trainingSetCount);
            return this;
        }
        public Builder validationSetCount(Integer validationSetCount) {
            this.validationSetCount = Objects.requireNonNull(validationSetCount);
            return this;
        }        public GetPredictionModelStatusResult build() {
            return new GetPredictionModelStatusResult(message, modelVersion, predictionGuidId, predictionName, signalsUsed, status, tenantId, testSetCount, trainingAccuracy, trainingSetCount, validationSetCount);
        }
    }
}
