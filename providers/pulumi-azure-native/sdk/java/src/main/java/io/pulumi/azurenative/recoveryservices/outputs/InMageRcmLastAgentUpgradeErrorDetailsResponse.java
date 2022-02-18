// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class InMageRcmLastAgentUpgradeErrorDetailsResponse {
    /**
     * The error code.
     * 
     */
    private final String errorCode;
    /**
     * The error message.
     * 
     */
    private final String errorMessage;
    /**
     * The error message parameters.
     * 
     */
    private final Map<String,String> errorMessageParameters;
    /**
     * The error tags.
     * 
     */
    private final Map<String,String> errorTags;
    /**
     * The possible causes.
     * 
     */
    private final String possibleCauses;
    /**
     * The recommended action.
     * 
     */
    private final String recommendedAction;

    @OutputCustomType.Constructor({"errorCode","errorMessage","errorMessageParameters","errorTags","possibleCauses","recommendedAction"})
    private InMageRcmLastAgentUpgradeErrorDetailsResponse(
        String errorCode,
        String errorMessage,
        Map<String,String> errorMessageParameters,
        Map<String,String> errorTags,
        String possibleCauses,
        String recommendedAction) {
        this.errorCode = Objects.requireNonNull(errorCode);
        this.errorMessage = Objects.requireNonNull(errorMessage);
        this.errorMessageParameters = Objects.requireNonNull(errorMessageParameters);
        this.errorTags = Objects.requireNonNull(errorTags);
        this.possibleCauses = Objects.requireNonNull(possibleCauses);
        this.recommendedAction = Objects.requireNonNull(recommendedAction);
    }

    /**
     * The error code.
     * 
     */
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * The error message.
     * 
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The error message parameters.
     * 
     */
    public Map<String,String> getErrorMessageParameters() {
        return this.errorMessageParameters;
    }
    /**
     * The error tags.
     * 
     */
    public Map<String,String> getErrorTags() {
        return this.errorTags;
    }
    /**
     * The possible causes.
     * 
     */
    public String getPossibleCauses() {
        return this.possibleCauses;
    }
    /**
     * The recommended action.
     * 
     */
    public String getRecommendedAction() {
        return this.recommendedAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmLastAgentUpgradeErrorDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorCode;
        private String errorMessage;
        private Map<String,String> errorMessageParameters;
        private Map<String,String> errorTags;
        private String possibleCauses;
        private String recommendedAction;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmLastAgentUpgradeErrorDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
    	      this.errorMessageParameters = defaults.errorMessageParameters;
    	      this.errorTags = defaults.errorTags;
    	      this.possibleCauses = defaults.possibleCauses;
    	      this.recommendedAction = defaults.recommendedAction;
        }

        public Builder setErrorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setErrorMessageParameters(Map<String,String> errorMessageParameters) {
            this.errorMessageParameters = Objects.requireNonNull(errorMessageParameters);
            return this;
        }

        public Builder setErrorTags(Map<String,String> errorTags) {
            this.errorTags = Objects.requireNonNull(errorTags);
            return this;
        }

        public Builder setPossibleCauses(String possibleCauses) {
            this.possibleCauses = Objects.requireNonNull(possibleCauses);
            return this;
        }

        public Builder setRecommendedAction(String recommendedAction) {
            this.recommendedAction = Objects.requireNonNull(recommendedAction);
            return this;
        }

        public InMageRcmLastAgentUpgradeErrorDetailsResponse build() {
            return new InMageRcmLastAgentUpgradeErrorDetailsResponse(errorCode, errorMessage, errorMessageParameters, errorTags, possibleCauses, recommendedAction);
        }
    }
}
