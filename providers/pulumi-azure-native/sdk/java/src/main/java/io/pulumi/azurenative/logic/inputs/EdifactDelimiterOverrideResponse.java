// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact delimiter override settings.
 * 
 */
public final class EdifactDelimiterOverrideResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdifactDelimiterOverrideResponse Empty = new EdifactDelimiterOverrideResponse();

    /**
     * The component separator.
     * 
     */
    @InputImport(name="componentSeparator", required=true)
      private final Integer componentSeparator;

    public Integer getComponentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @InputImport(name="dataElementSeparator", required=true)
      private final Integer dataElementSeparator;

    public Integer getDataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The decimal point indicator.
     * 
     */
    @InputImport(name="decimalPointIndicator", required=true)
      private final String decimalPointIndicator;

    public String getDecimalPointIndicator() {
        return this.decimalPointIndicator;
    }

    /**
     * The message association assigned code.
     * 
     */
    @InputImport(name="messageAssociationAssignedCode")
      private final @Nullable String messageAssociationAssignedCode;

    public Optional<String> getMessageAssociationAssignedCode() {
        return this.messageAssociationAssignedCode == null ? Optional.empty() : Optional.ofNullable(this.messageAssociationAssignedCode);
    }

    /**
     * The message id.
     * 
     */
    @InputImport(name="messageId")
      private final @Nullable String messageId;

    public Optional<String> getMessageId() {
        return this.messageId == null ? Optional.empty() : Optional.ofNullable(this.messageId);
    }

    /**
     * The message release.
     * 
     */
    @InputImport(name="messageRelease")
      private final @Nullable String messageRelease;

    public Optional<String> getMessageRelease() {
        return this.messageRelease == null ? Optional.empty() : Optional.ofNullable(this.messageRelease);
    }

    /**
     * The message version.
     * 
     */
    @InputImport(name="messageVersion")
      private final @Nullable String messageVersion;

    public Optional<String> getMessageVersion() {
        return this.messageVersion == null ? Optional.empty() : Optional.ofNullable(this.messageVersion);
    }

    /**
     * The release indicator.
     * 
     */
    @InputImport(name="releaseIndicator", required=true)
      private final Integer releaseIndicator;

    public Integer getReleaseIndicator() {
        return this.releaseIndicator;
    }

    /**
     * The repetition separator.
     * 
     */
    @InputImport(name="repetitionSeparator", required=true)
      private final Integer repetitionSeparator;

    public Integer getRepetitionSeparator() {
        return this.repetitionSeparator;
    }

    /**
     * The segment terminator.
     * 
     */
    @InputImport(name="segmentTerminator", required=true)
      private final Integer segmentTerminator;

    public Integer getSegmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The segment terminator suffix.
     * 
     */
    @InputImport(name="segmentTerminatorSuffix", required=true)
      private final String segmentTerminatorSuffix;

    public String getSegmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * The target namespace on which this delimiter settings has to be applied.
     * 
     */
    @InputImport(name="targetNamespace")
      private final @Nullable String targetNamespace;

    public Optional<String> getTargetNamespace() {
        return this.targetNamespace == null ? Optional.empty() : Optional.ofNullable(this.targetNamespace);
    }

    public EdifactDelimiterOverrideResponse(
        Integer componentSeparator,
        Integer dataElementSeparator,
        String decimalPointIndicator,
        @Nullable String messageAssociationAssignedCode,
        @Nullable String messageId,
        @Nullable String messageRelease,
        @Nullable String messageVersion,
        Integer releaseIndicator,
        Integer repetitionSeparator,
        Integer segmentTerminator,
        String segmentTerminatorSuffix,
        @Nullable String targetNamespace) {
        this.componentSeparator = Objects.requireNonNull(componentSeparator, "expected parameter 'componentSeparator' to be non-null");
        this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
        this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator, "expected parameter 'decimalPointIndicator' to be non-null");
        this.messageAssociationAssignedCode = messageAssociationAssignedCode;
        this.messageId = messageId;
        this.messageRelease = messageRelease;
        this.messageVersion = messageVersion;
        this.releaseIndicator = Objects.requireNonNull(releaseIndicator, "expected parameter 'releaseIndicator' to be non-null");
        this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator, "expected parameter 'repetitionSeparator' to be non-null");
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
        this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
        this.targetNamespace = targetNamespace;
    }

    private EdifactDelimiterOverrideResponse() {
        this.componentSeparator = null;
        this.dataElementSeparator = null;
        this.decimalPointIndicator = null;
        this.messageAssociationAssignedCode = null;
        this.messageId = null;
        this.messageRelease = null;
        this.messageVersion = null;
        this.releaseIndicator = null;
        this.repetitionSeparator = null;
        this.segmentTerminator = null;
        this.segmentTerminatorSuffix = null;
        this.targetNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactDelimiterOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer componentSeparator;
        private Integer dataElementSeparator;
        private String decimalPointIndicator;
        private @Nullable String messageAssociationAssignedCode;
        private @Nullable String messageId;
        private @Nullable String messageRelease;
        private @Nullable String messageVersion;
        private Integer releaseIndicator;
        private Integer repetitionSeparator;
        private Integer segmentTerminator;
        private String segmentTerminatorSuffix;
        private @Nullable String targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactDelimiterOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.decimalPointIndicator = defaults.decimalPointIndicator;
    	      this.messageAssociationAssignedCode = defaults.messageAssociationAssignedCode;
    	      this.messageId = defaults.messageId;
    	      this.messageRelease = defaults.messageRelease;
    	      this.messageVersion = defaults.messageVersion;
    	      this.releaseIndicator = defaults.releaseIndicator;
    	      this.repetitionSeparator = defaults.repetitionSeparator;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.segmentTerminatorSuffix = defaults.segmentTerminatorSuffix;
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder setComponentSeparator(Integer componentSeparator) {
            this.componentSeparator = Objects.requireNonNull(componentSeparator);
            return this;
        }

        public Builder setDataElementSeparator(Integer dataElementSeparator) {
            this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator);
            return this;
        }

        public Builder setDecimalPointIndicator(String decimalPointIndicator) {
            this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator);
            return this;
        }

        public Builder setMessageAssociationAssignedCode(@Nullable String messageAssociationAssignedCode) {
            this.messageAssociationAssignedCode = messageAssociationAssignedCode;
            return this;
        }

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setMessageRelease(@Nullable String messageRelease) {
            this.messageRelease = messageRelease;
            return this;
        }

        public Builder setMessageVersion(@Nullable String messageVersion) {
            this.messageVersion = messageVersion;
            return this;
        }

        public Builder setReleaseIndicator(Integer releaseIndicator) {
            this.releaseIndicator = Objects.requireNonNull(releaseIndicator);
            return this;
        }

        public Builder setRepetitionSeparator(Integer repetitionSeparator) {
            this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator);
            return this;
        }

        public Builder setSegmentTerminator(Integer segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }

        public Builder setSegmentTerminatorSuffix(String segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix);
            return this;
        }

        public Builder setTargetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }
        public EdifactDelimiterOverrideResponse build() {
            return new EdifactDelimiterOverrideResponse(componentSeparator, dataElementSeparator, decimalPointIndicator, messageAssociationAssignedCode, messageId, messageRelease, messageVersion, releaseIndicator, repetitionSeparator, segmentTerminator, segmentTerminatorSuffix, targetNamespace);
        }
    }
}