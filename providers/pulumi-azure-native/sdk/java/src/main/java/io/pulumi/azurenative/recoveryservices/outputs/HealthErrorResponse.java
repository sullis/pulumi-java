// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.InnerHealthErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HealthErrorResponse {
    /**
     * Error creation time (UTC)
     * 
     */
    private final @Nullable String creationTimeUtc;
    /**
     * Value indicating whether the health error is customer resolvable.
     * 
     */
    private final @Nullable String customerResolvability;
    /**
     * ID of the entity.
     * 
     */
    private final @Nullable String entityId;
    /**
     * Category of error.
     * 
     */
    private final @Nullable String errorCategory;
    /**
     * Error code.
     * 
     */
    private final @Nullable String errorCode;
    /**
     * The health error unique id.
     * 
     */
    private final @Nullable String errorId;
    /**
     * Level of error.
     * 
     */
    private final @Nullable String errorLevel;
    /**
     * Error message.
     * 
     */
    private final @Nullable String errorMessage;
    /**
     * Source of error.
     * 
     */
    private final @Nullable String errorSource;
    /**
     * Type of error.
     * 
     */
    private final @Nullable String errorType;
    /**
     * The inner health errors. HealthError having a list of HealthError as child errors is problematic. InnerHealthError is used because this will prevent an infinite loop of structures when Hydra tries to auto-generate the contract. We are exposing the related health errors as inner health errors and all API consumers can utilize this in the same fashion as Exception -&gt; InnerException.
     * 
     */
    private final @Nullable List<InnerHealthErrorResponse> innerHealthErrors;
    /**
     * Possible causes of error.
     * 
     */
    private final @Nullable String possibleCauses;
    /**
     * Recommended action to resolve error.
     * 
     */
    private final @Nullable String recommendedAction;
    /**
     * DRA error message.
     * 
     */
    private final @Nullable String recoveryProviderErrorMessage;
    /**
     * Summary message of the entity.
     * 
     */
    private final @Nullable String summaryMessage;

    @OutputCustomType.Constructor({"creationTimeUtc","customerResolvability","entityId","errorCategory","errorCode","errorId","errorLevel","errorMessage","errorSource","errorType","innerHealthErrors","possibleCauses","recommendedAction","recoveryProviderErrorMessage","summaryMessage"})
    private HealthErrorResponse(
        @Nullable String creationTimeUtc,
        @Nullable String customerResolvability,
        @Nullable String entityId,
        @Nullable String errorCategory,
        @Nullable String errorCode,
        @Nullable String errorId,
        @Nullable String errorLevel,
        @Nullable String errorMessage,
        @Nullable String errorSource,
        @Nullable String errorType,
        @Nullable List<InnerHealthErrorResponse> innerHealthErrors,
        @Nullable String possibleCauses,
        @Nullable String recommendedAction,
        @Nullable String recoveryProviderErrorMessage,
        @Nullable String summaryMessage) {
        this.creationTimeUtc = creationTimeUtc;
        this.customerResolvability = customerResolvability;
        this.entityId = entityId;
        this.errorCategory = errorCategory;
        this.errorCode = errorCode;
        this.errorId = errorId;
        this.errorLevel = errorLevel;
        this.errorMessage = errorMessage;
        this.errorSource = errorSource;
        this.errorType = errorType;
        this.innerHealthErrors = innerHealthErrors;
        this.possibleCauses = possibleCauses;
        this.recommendedAction = recommendedAction;
        this.recoveryProviderErrorMessage = recoveryProviderErrorMessage;
        this.summaryMessage = summaryMessage;
    }

    /**
     * Error creation time (UTC)
     * 
    */
    public Optional<String> getCreationTimeUtc() {
        return Optional.ofNullable(this.creationTimeUtc);
    }
    /**
     * Value indicating whether the health error is customer resolvable.
     * 
    */
    public Optional<String> getCustomerResolvability() {
        return Optional.ofNullable(this.customerResolvability);
    }
    /**
     * ID of the entity.
     * 
    */
    public Optional<String> getEntityId() {
        return Optional.ofNullable(this.entityId);
    }
    /**
     * Category of error.
     * 
    */
    public Optional<String> getErrorCategory() {
        return Optional.ofNullable(this.errorCategory);
    }
    /**
     * Error code.
     * 
    */
    public Optional<String> getErrorCode() {
        return Optional.ofNullable(this.errorCode);
    }
    /**
     * The health error unique id.
     * 
    */
    public Optional<String> getErrorId() {
        return Optional.ofNullable(this.errorId);
    }
    /**
     * Level of error.
     * 
    */
    public Optional<String> getErrorLevel() {
        return Optional.ofNullable(this.errorLevel);
    }
    /**
     * Error message.
     * 
    */
    public Optional<String> getErrorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    /**
     * Source of error.
     * 
    */
    public Optional<String> getErrorSource() {
        return Optional.ofNullable(this.errorSource);
    }
    /**
     * Type of error.
     * 
    */
    public Optional<String> getErrorType() {
        return Optional.ofNullable(this.errorType);
    }
    /**
     * The inner health errors. HealthError having a list of HealthError as child errors is problematic. InnerHealthError is used because this will prevent an infinite loop of structures when Hydra tries to auto-generate the contract. We are exposing the related health errors as inner health errors and all API consumers can utilize this in the same fashion as Exception -&gt; InnerException.
     * 
    */
    public List<InnerHealthErrorResponse> getInnerHealthErrors() {
        return this.innerHealthErrors == null ? List.of() : this.innerHealthErrors;
    }
    /**
     * Possible causes of error.
     * 
    */
    public Optional<String> getPossibleCauses() {
        return Optional.ofNullable(this.possibleCauses);
    }
    /**
     * Recommended action to resolve error.
     * 
    */
    public Optional<String> getRecommendedAction() {
        return Optional.ofNullable(this.recommendedAction);
    }
    /**
     * DRA error message.
     * 
    */
    public Optional<String> getRecoveryProviderErrorMessage() {
        return Optional.ofNullable(this.recoveryProviderErrorMessage);
    }
    /**
     * Summary message of the entity.
     * 
    */
    public Optional<String> getSummaryMessage() {
        return Optional.ofNullable(this.summaryMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTimeUtc;
        private @Nullable String customerResolvability;
        private @Nullable String entityId;
        private @Nullable String errorCategory;
        private @Nullable String errorCode;
        private @Nullable String errorId;
        private @Nullable String errorLevel;
        private @Nullable String errorMessage;
        private @Nullable String errorSource;
        private @Nullable String errorType;
        private @Nullable List<InnerHealthErrorResponse> innerHealthErrors;
        private @Nullable String possibleCauses;
        private @Nullable String recommendedAction;
        private @Nullable String recoveryProviderErrorMessage;
        private @Nullable String summaryMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimeUtc = defaults.creationTimeUtc;
    	      this.customerResolvability = defaults.customerResolvability;
    	      this.entityId = defaults.entityId;
    	      this.errorCategory = defaults.errorCategory;
    	      this.errorCode = defaults.errorCode;
    	      this.errorId = defaults.errorId;
    	      this.errorLevel = defaults.errorLevel;
    	      this.errorMessage = defaults.errorMessage;
    	      this.errorSource = defaults.errorSource;
    	      this.errorType = defaults.errorType;
    	      this.innerHealthErrors = defaults.innerHealthErrors;
    	      this.possibleCauses = defaults.possibleCauses;
    	      this.recommendedAction = defaults.recommendedAction;
    	      this.recoveryProviderErrorMessage = defaults.recoveryProviderErrorMessage;
    	      this.summaryMessage = defaults.summaryMessage;
        }

        public Builder setCreationTimeUtc(@Nullable String creationTimeUtc) {
            this.creationTimeUtc = creationTimeUtc;
            return this;
        }

        public Builder setCustomerResolvability(@Nullable String customerResolvability) {
            this.customerResolvability = customerResolvability;
            return this;
        }

        public Builder setEntityId(@Nullable String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder setErrorCategory(@Nullable String errorCategory) {
            this.errorCategory = errorCategory;
            return this;
        }

        public Builder setErrorCode(@Nullable String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder setErrorId(@Nullable String errorId) {
            this.errorId = errorId;
            return this;
        }

        public Builder setErrorLevel(@Nullable String errorLevel) {
            this.errorLevel = errorLevel;
            return this;
        }

        public Builder setErrorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder setErrorSource(@Nullable String errorSource) {
            this.errorSource = errorSource;
            return this;
        }

        public Builder setErrorType(@Nullable String errorType) {
            this.errorType = errorType;
            return this;
        }

        public Builder setInnerHealthErrors(@Nullable List<InnerHealthErrorResponse> innerHealthErrors) {
            this.innerHealthErrors = innerHealthErrors;
            return this;
        }

        public Builder setPossibleCauses(@Nullable String possibleCauses) {
            this.possibleCauses = possibleCauses;
            return this;
        }

        public Builder setRecommendedAction(@Nullable String recommendedAction) {
            this.recommendedAction = recommendedAction;
            return this;
        }

        public Builder setRecoveryProviderErrorMessage(@Nullable String recoveryProviderErrorMessage) {
            this.recoveryProviderErrorMessage = recoveryProviderErrorMessage;
            return this;
        }

        public Builder setSummaryMessage(@Nullable String summaryMessage) {
            this.summaryMessage = summaryMessage;
            return this;
        }
        public HealthErrorResponse build() {
            return new HealthErrorResponse(creationTimeUtc, customerResolvability, entityId, errorCategory, errorCode, errorId, errorLevel, errorMessage, errorSource, errorType, innerHealthErrors, possibleCauses, recommendedAction, recoveryProviderErrorMessage, summaryMessage);
        }
    }
}