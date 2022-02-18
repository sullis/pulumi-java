// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * InMageRcm last source agent upgrade error details.
 * 
 */
public final class InMageRcmLastAgentUpgradeErrorDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InMageRcmLastAgentUpgradeErrorDetailsResponse Empty = new InMageRcmLastAgentUpgradeErrorDetailsResponse();

    /**
     * The error code.
     * 
     */
    @InputImport(name="errorCode", required=true)
    private final String errorCode;

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * The error message.
     * 
     */
    @InputImport(name="errorMessage", required=true)
    private final String errorMessage;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * The error message parameters.
     * 
     */
    @InputImport(name="errorMessageParameters", required=true)
    private final Map<String,String> errorMessageParameters;

    public Map<String,String> getErrorMessageParameters() {
        return this.errorMessageParameters;
    }

    /**
     * The error tags.
     * 
     */
    @InputImport(name="errorTags", required=true)
    private final Map<String,String> errorTags;

    public Map<String,String> getErrorTags() {
        return this.errorTags;
    }

    /**
     * The possible causes.
     * 
     */
    @InputImport(name="possibleCauses", required=true)
    private final String possibleCauses;

    public String getPossibleCauses() {
        return this.possibleCauses;
    }

    /**
     * The recommended action.
     * 
     */
    @InputImport(name="recommendedAction", required=true)
    private final String recommendedAction;

    public String getRecommendedAction() {
        return this.recommendedAction;
    }

    public InMageRcmLastAgentUpgradeErrorDetailsResponse(
        String errorCode,
        String errorMessage,
        Map<String,String> errorMessageParameters,
        Map<String,String> errorTags,
        String possibleCauses,
        String recommendedAction) {
        this.errorCode = Objects.requireNonNull(errorCode, "expected parameter 'errorCode' to be non-null");
        this.errorMessage = Objects.requireNonNull(errorMessage, "expected parameter 'errorMessage' to be non-null");
        this.errorMessageParameters = Objects.requireNonNull(errorMessageParameters, "expected parameter 'errorMessageParameters' to be non-null");
        this.errorTags = Objects.requireNonNull(errorTags, "expected parameter 'errorTags' to be non-null");
        this.possibleCauses = Objects.requireNonNull(possibleCauses, "expected parameter 'possibleCauses' to be non-null");
        this.recommendedAction = Objects.requireNonNull(recommendedAction, "expected parameter 'recommendedAction' to be non-null");
    }

    private InMageRcmLastAgentUpgradeErrorDetailsResponse() {
        this.errorCode = null;
        this.errorMessage = null;
        this.errorMessageParameters = Map.of();
        this.errorTags = Map.of();
        this.possibleCauses = null;
        this.recommendedAction = null;
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
