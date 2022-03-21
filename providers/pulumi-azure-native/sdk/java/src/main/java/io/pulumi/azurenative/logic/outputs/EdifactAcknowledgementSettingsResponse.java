// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdifactAcknowledgementSettingsResponse {
    /**
     * The acknowledgement control number lower bound.
     * 
     */
    private final Integer acknowledgementControlNumberLowerBound;
    /**
     * The acknowledgement control number prefix.
     * 
     */
    private final @Nullable String acknowledgementControlNumberPrefix;
    /**
     * The acknowledgement control number suffix.
     * 
     */
    private final @Nullable String acknowledgementControlNumberSuffix;
    /**
     * The acknowledgement control number upper bound.
     * 
     */
    private final Integer acknowledgementControlNumberUpperBound;
    /**
     * The value indicating whether to batch functional acknowledgements.
     * 
     */
    private final Boolean batchFunctionalAcknowledgements;
    /**
     * The value indicating whether to batch the technical acknowledgements.
     * 
     */
    private final Boolean batchTechnicalAcknowledgements;
    /**
     * The value indicating whether functional acknowledgement is needed.
     * 
     */
    private final Boolean needFunctionalAcknowledgement;
    /**
     * The value indicating whether a loop is needed for valid messages.
     * 
     */
    private final Boolean needLoopForValidMessages;
    /**
     * The value indicating whether technical acknowledgement is needed.
     * 
     */
    private final Boolean needTechnicalAcknowledgement;
    /**
     * The value indicating whether to rollover acknowledgement control number.
     * 
     */
    private final Boolean rolloverAcknowledgementControlNumber;
    /**
     * The value indicating whether to send synchronous acknowledgement.
     * 
     */
    private final Boolean sendSynchronousAcknowledgement;

    @CustomType.Constructor
    private EdifactAcknowledgementSettingsResponse(
        @CustomType.Parameter("acknowledgementControlNumberLowerBound") Integer acknowledgementControlNumberLowerBound,
        @CustomType.Parameter("acknowledgementControlNumberPrefix") @Nullable String acknowledgementControlNumberPrefix,
        @CustomType.Parameter("acknowledgementControlNumberSuffix") @Nullable String acknowledgementControlNumberSuffix,
        @CustomType.Parameter("acknowledgementControlNumberUpperBound") Integer acknowledgementControlNumberUpperBound,
        @CustomType.Parameter("batchFunctionalAcknowledgements") Boolean batchFunctionalAcknowledgements,
        @CustomType.Parameter("batchTechnicalAcknowledgements") Boolean batchTechnicalAcknowledgements,
        @CustomType.Parameter("needFunctionalAcknowledgement") Boolean needFunctionalAcknowledgement,
        @CustomType.Parameter("needLoopForValidMessages") Boolean needLoopForValidMessages,
        @CustomType.Parameter("needTechnicalAcknowledgement") Boolean needTechnicalAcknowledgement,
        @CustomType.Parameter("rolloverAcknowledgementControlNumber") Boolean rolloverAcknowledgementControlNumber,
        @CustomType.Parameter("sendSynchronousAcknowledgement") Boolean sendSynchronousAcknowledgement) {
        this.acknowledgementControlNumberLowerBound = acknowledgementControlNumberLowerBound;
        this.acknowledgementControlNumberPrefix = acknowledgementControlNumberPrefix;
        this.acknowledgementControlNumberSuffix = acknowledgementControlNumberSuffix;
        this.acknowledgementControlNumberUpperBound = acknowledgementControlNumberUpperBound;
        this.batchFunctionalAcknowledgements = batchFunctionalAcknowledgements;
        this.batchTechnicalAcknowledgements = batchTechnicalAcknowledgements;
        this.needFunctionalAcknowledgement = needFunctionalAcknowledgement;
        this.needLoopForValidMessages = needLoopForValidMessages;
        this.needTechnicalAcknowledgement = needTechnicalAcknowledgement;
        this.rolloverAcknowledgementControlNumber = rolloverAcknowledgementControlNumber;
        this.sendSynchronousAcknowledgement = sendSynchronousAcknowledgement;
    }

    /**
     * The acknowledgement control number lower bound.
     * 
    */
    public Integer getAcknowledgementControlNumberLowerBound() {
        return this.acknowledgementControlNumberLowerBound;
    }
    /**
     * The acknowledgement control number prefix.
     * 
    */
    public Optional<String> getAcknowledgementControlNumberPrefix() {
        return Optional.ofNullable(this.acknowledgementControlNumberPrefix);
    }
    /**
     * The acknowledgement control number suffix.
     * 
    */
    public Optional<String> getAcknowledgementControlNumberSuffix() {
        return Optional.ofNullable(this.acknowledgementControlNumberSuffix);
    }
    /**
     * The acknowledgement control number upper bound.
     * 
    */
    public Integer getAcknowledgementControlNumberUpperBound() {
        return this.acknowledgementControlNumberUpperBound;
    }
    /**
     * The value indicating whether to batch functional acknowledgements.
     * 
    */
    public Boolean getBatchFunctionalAcknowledgements() {
        return this.batchFunctionalAcknowledgements;
    }
    /**
     * The value indicating whether to batch the technical acknowledgements.
     * 
    */
    public Boolean getBatchTechnicalAcknowledgements() {
        return this.batchTechnicalAcknowledgements;
    }
    /**
     * The value indicating whether functional acknowledgement is needed.
     * 
    */
    public Boolean getNeedFunctionalAcknowledgement() {
        return this.needFunctionalAcknowledgement;
    }
    /**
     * The value indicating whether a loop is needed for valid messages.
     * 
    */
    public Boolean getNeedLoopForValidMessages() {
        return this.needLoopForValidMessages;
    }
    /**
     * The value indicating whether technical acknowledgement is needed.
     * 
    */
    public Boolean getNeedTechnicalAcknowledgement() {
        return this.needTechnicalAcknowledgement;
    }
    /**
     * The value indicating whether to rollover acknowledgement control number.
     * 
    */
    public Boolean getRolloverAcknowledgementControlNumber() {
        return this.rolloverAcknowledgementControlNumber;
    }
    /**
     * The value indicating whether to send synchronous acknowledgement.
     * 
    */
    public Boolean getSendSynchronousAcknowledgement() {
        return this.sendSynchronousAcknowledgement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactAcknowledgementSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer acknowledgementControlNumberLowerBound;
        private @Nullable String acknowledgementControlNumberPrefix;
        private @Nullable String acknowledgementControlNumberSuffix;
        private Integer acknowledgementControlNumberUpperBound;
        private Boolean batchFunctionalAcknowledgements;
        private Boolean batchTechnicalAcknowledgements;
        private Boolean needFunctionalAcknowledgement;
        private Boolean needLoopForValidMessages;
        private Boolean needTechnicalAcknowledgement;
        private Boolean rolloverAcknowledgementControlNumber;
        private Boolean sendSynchronousAcknowledgement;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactAcknowledgementSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementControlNumberLowerBound = defaults.acknowledgementControlNumberLowerBound;
    	      this.acknowledgementControlNumberPrefix = defaults.acknowledgementControlNumberPrefix;
    	      this.acknowledgementControlNumberSuffix = defaults.acknowledgementControlNumberSuffix;
    	      this.acknowledgementControlNumberUpperBound = defaults.acknowledgementControlNumberUpperBound;
    	      this.batchFunctionalAcknowledgements = defaults.batchFunctionalAcknowledgements;
    	      this.batchTechnicalAcknowledgements = defaults.batchTechnicalAcknowledgements;
    	      this.needFunctionalAcknowledgement = defaults.needFunctionalAcknowledgement;
    	      this.needLoopForValidMessages = defaults.needLoopForValidMessages;
    	      this.needTechnicalAcknowledgement = defaults.needTechnicalAcknowledgement;
    	      this.rolloverAcknowledgementControlNumber = defaults.rolloverAcknowledgementControlNumber;
    	      this.sendSynchronousAcknowledgement = defaults.sendSynchronousAcknowledgement;
        }

        public Builder acknowledgementControlNumberLowerBound(Integer acknowledgementControlNumberLowerBound) {
            this.acknowledgementControlNumberLowerBound = Objects.requireNonNull(acknowledgementControlNumberLowerBound);
            return this;
        }
        public Builder acknowledgementControlNumberPrefix(@Nullable String acknowledgementControlNumberPrefix) {
            this.acknowledgementControlNumberPrefix = acknowledgementControlNumberPrefix;
            return this;
        }
        public Builder acknowledgementControlNumberSuffix(@Nullable String acknowledgementControlNumberSuffix) {
            this.acknowledgementControlNumberSuffix = acknowledgementControlNumberSuffix;
            return this;
        }
        public Builder acknowledgementControlNumberUpperBound(Integer acknowledgementControlNumberUpperBound) {
            this.acknowledgementControlNumberUpperBound = Objects.requireNonNull(acknowledgementControlNumberUpperBound);
            return this;
        }
        public Builder batchFunctionalAcknowledgements(Boolean batchFunctionalAcknowledgements) {
            this.batchFunctionalAcknowledgements = Objects.requireNonNull(batchFunctionalAcknowledgements);
            return this;
        }
        public Builder batchTechnicalAcknowledgements(Boolean batchTechnicalAcknowledgements) {
            this.batchTechnicalAcknowledgements = Objects.requireNonNull(batchTechnicalAcknowledgements);
            return this;
        }
        public Builder needFunctionalAcknowledgement(Boolean needFunctionalAcknowledgement) {
            this.needFunctionalAcknowledgement = Objects.requireNonNull(needFunctionalAcknowledgement);
            return this;
        }
        public Builder needLoopForValidMessages(Boolean needLoopForValidMessages) {
            this.needLoopForValidMessages = Objects.requireNonNull(needLoopForValidMessages);
            return this;
        }
        public Builder needTechnicalAcknowledgement(Boolean needTechnicalAcknowledgement) {
            this.needTechnicalAcknowledgement = Objects.requireNonNull(needTechnicalAcknowledgement);
            return this;
        }
        public Builder rolloverAcknowledgementControlNumber(Boolean rolloverAcknowledgementControlNumber) {
            this.rolloverAcknowledgementControlNumber = Objects.requireNonNull(rolloverAcknowledgementControlNumber);
            return this;
        }
        public Builder sendSynchronousAcknowledgement(Boolean sendSynchronousAcknowledgement) {
            this.sendSynchronousAcknowledgement = Objects.requireNonNull(sendSynchronousAcknowledgement);
            return this;
        }        public EdifactAcknowledgementSettingsResponse build() {
            return new EdifactAcknowledgementSettingsResponse(acknowledgementControlNumberLowerBound, acknowledgementControlNumberPrefix, acknowledgementControlNumberSuffix, acknowledgementControlNumberUpperBound, batchFunctionalAcknowledgements, batchTechnicalAcknowledgements, needFunctionalAcknowledgement, needLoopForValidMessages, needTechnicalAcknowledgement, rolloverAcknowledgementControlNumber, sendSynchronousAcknowledgement);
        }
    }
}
