// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManagedIntegrationRuntimeOperationResultResponse {
    /**
     * The activity id for the operation request.
     * 
     */
    private final String activityId;
    /**
     * The error code.
     * 
     */
    private final String errorCode;
    /**
     * Managed integration runtime error parameters.
     * 
     */
    private final List<String> parameters;
    /**
     * The operation result.
     * 
     */
    private final String result;
    /**
     * The start time of the operation.
     * 
     */
    private final String startTime;
    /**
     * The operation type. Could be start or stop.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"activityId","errorCode","parameters","result","startTime","type"})
    private ManagedIntegrationRuntimeOperationResultResponse(
        String activityId,
        String errorCode,
        List<String> parameters,
        String result,
        String startTime,
        String type) {
        this.activityId = Objects.requireNonNull(activityId);
        this.errorCode = Objects.requireNonNull(errorCode);
        this.parameters = Objects.requireNonNull(parameters);
        this.result = Objects.requireNonNull(result);
        this.startTime = Objects.requireNonNull(startTime);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The activity id for the operation request.
     * 
     */
    public String getActivityId() {
        return this.activityId;
    }
    /**
     * The error code.
     * 
     */
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * Managed integration runtime error parameters.
     * 
     */
    public List<String> getParameters() {
        return this.parameters;
    }
    /**
     * The operation result.
     * 
     */
    public String getResult() {
        return this.result;
    }
    /**
     * The start time of the operation.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The operation type. Could be start or stop.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeOperationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activityId;
        private String errorCode;
        private List<String> parameters;
        private String result;
        private String startTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeOperationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activityId = defaults.activityId;
    	      this.errorCode = defaults.errorCode;
    	      this.parameters = defaults.parameters;
    	      this.result = defaults.result;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder setActivityId(String activityId) {
            this.activityId = Objects.requireNonNull(activityId);
            return this;
        }

        public Builder setErrorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setParameters(List<String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setResult(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ManagedIntegrationRuntimeOperationResultResponse build() {
            return new ManagedIntegrationRuntimeOperationResultResponse(activityId, errorCode, parameters, result, startTime, type);
        }
    }
}
