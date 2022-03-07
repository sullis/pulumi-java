// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 delimiter override settings.
 * 
 */
public final class X12DelimiterOverridesResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12DelimiterOverridesResponse Empty = new X12DelimiterOverridesResponse();

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
     * The message id.
     * 
     */
    @InputImport(name="messageId")
      private final @Nullable String messageId;

    public Optional<String> getMessageId() {
        return this.messageId == null ? Optional.empty() : Optional.ofNullable(this.messageId);
    }

    /**
     * The protocol version.
     * 
     */
    @InputImport(name="protocolVersion")
      private final @Nullable String protocolVersion;

    public Optional<String> getProtocolVersion() {
        return this.protocolVersion == null ? Optional.empty() : Optional.ofNullable(this.protocolVersion);
    }

    /**
     * The replacement character.
     * 
     */
    @InputImport(name="replaceCharacter", required=true)
      private final Integer replaceCharacter;

    public Integer getReplaceCharacter() {
        return this.replaceCharacter;
    }

    /**
     * The value indicating whether to replace separators in payload.
     * 
     */
    @InputImport(name="replaceSeparatorsInPayload", required=true)
      private final Boolean replaceSeparatorsInPayload;

    public Boolean getReplaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
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

    public X12DelimiterOverridesResponse(
        Integer componentSeparator,
        Integer dataElementSeparator,
        @Nullable String messageId,
        @Nullable String protocolVersion,
        Integer replaceCharacter,
        Boolean replaceSeparatorsInPayload,
        Integer segmentTerminator,
        String segmentTerminatorSuffix,
        @Nullable String targetNamespace) {
        this.componentSeparator = Objects.requireNonNull(componentSeparator, "expected parameter 'componentSeparator' to be non-null");
        this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
        this.messageId = messageId;
        this.protocolVersion = protocolVersion;
        this.replaceCharacter = Objects.requireNonNull(replaceCharacter, "expected parameter 'replaceCharacter' to be non-null");
        this.replaceSeparatorsInPayload = Objects.requireNonNull(replaceSeparatorsInPayload, "expected parameter 'replaceSeparatorsInPayload' to be non-null");
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
        this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
        this.targetNamespace = targetNamespace;
    }

    private X12DelimiterOverridesResponse() {
        this.componentSeparator = null;
        this.dataElementSeparator = null;
        this.messageId = null;
        this.protocolVersion = null;
        this.replaceCharacter = null;
        this.replaceSeparatorsInPayload = null;
        this.segmentTerminator = null;
        this.segmentTerminatorSuffix = null;
        this.targetNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12DelimiterOverridesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer componentSeparator;
        private Integer dataElementSeparator;
        private @Nullable String messageId;
        private @Nullable String protocolVersion;
        private Integer replaceCharacter;
        private Boolean replaceSeparatorsInPayload;
        private Integer segmentTerminator;
        private String segmentTerminatorSuffix;
        private @Nullable String targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(X12DelimiterOverridesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.messageId = defaults.messageId;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.replaceCharacter = defaults.replaceCharacter;
    	      this.replaceSeparatorsInPayload = defaults.replaceSeparatorsInPayload;
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

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setProtocolVersion(@Nullable String protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }

        public Builder setReplaceCharacter(Integer replaceCharacter) {
            this.replaceCharacter = Objects.requireNonNull(replaceCharacter);
            return this;
        }

        public Builder setReplaceSeparatorsInPayload(Boolean replaceSeparatorsInPayload) {
            this.replaceSeparatorsInPayload = Objects.requireNonNull(replaceSeparatorsInPayload);
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
        public X12DelimiterOverridesResponse build() {
            return new X12DelimiterOverridesResponse(componentSeparator, dataElementSeparator, messageId, protocolVersion, replaceCharacter, replaceSeparatorsInPayload, segmentTerminator, segmentTerminatorSuffix, targetNamespace);
        }
    }
}