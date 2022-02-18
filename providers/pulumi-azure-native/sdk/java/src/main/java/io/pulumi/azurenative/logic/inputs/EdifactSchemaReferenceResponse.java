// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact schema reference.
 * 
 */
public final class EdifactSchemaReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdifactSchemaReferenceResponse Empty = new EdifactSchemaReferenceResponse();

    /**
     * The association assigned code.
     * 
     */
    @InputImport(name="associationAssignedCode")
    private final @Nullable String associationAssignedCode;

    public Optional<String> getAssociationAssignedCode() {
        return this.associationAssignedCode == null ? Optional.empty() : Optional.ofNullable(this.associationAssignedCode);
    }

    /**
     * The message id.
     * 
     */
    @InputImport(name="messageId", required=true)
    private final String messageId;

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * The message release version.
     * 
     */
    @InputImport(name="messageRelease", required=true)
    private final String messageRelease;

    public String getMessageRelease() {
        return this.messageRelease;
    }

    /**
     * The message version.
     * 
     */
    @InputImport(name="messageVersion", required=true)
    private final String messageVersion;

    public String getMessageVersion() {
        return this.messageVersion;
    }

    /**
     * The schema name.
     * 
     */
    @InputImport(name="schemaName", required=true)
    private final String schemaName;

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * The sender application id.
     * 
     */
    @InputImport(name="senderApplicationId")
    private final @Nullable String senderApplicationId;

    public Optional<String> getSenderApplicationId() {
        return this.senderApplicationId == null ? Optional.empty() : Optional.ofNullable(this.senderApplicationId);
    }

    /**
     * The sender application qualifier.
     * 
     */
    @InputImport(name="senderApplicationQualifier")
    private final @Nullable String senderApplicationQualifier;

    public Optional<String> getSenderApplicationQualifier() {
        return this.senderApplicationQualifier == null ? Optional.empty() : Optional.ofNullable(this.senderApplicationQualifier);
    }

    public EdifactSchemaReferenceResponse(
        @Nullable String associationAssignedCode,
        String messageId,
        String messageRelease,
        String messageVersion,
        String schemaName,
        @Nullable String senderApplicationId,
        @Nullable String senderApplicationQualifier) {
        this.associationAssignedCode = associationAssignedCode;
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.messageRelease = Objects.requireNonNull(messageRelease, "expected parameter 'messageRelease' to be non-null");
        this.messageVersion = Objects.requireNonNull(messageVersion, "expected parameter 'messageVersion' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.senderApplicationId = senderApplicationId;
        this.senderApplicationQualifier = senderApplicationQualifier;
    }

    private EdifactSchemaReferenceResponse() {
        this.associationAssignedCode = null;
        this.messageId = null;
        this.messageRelease = null;
        this.messageVersion = null;
        this.schemaName = null;
        this.senderApplicationId = null;
        this.senderApplicationQualifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactSchemaReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String associationAssignedCode;
        private String messageId;
        private String messageRelease;
        private String messageVersion;
        private String schemaName;
        private @Nullable String senderApplicationId;
        private @Nullable String senderApplicationQualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactSchemaReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationAssignedCode = defaults.associationAssignedCode;
    	      this.messageId = defaults.messageId;
    	      this.messageRelease = defaults.messageRelease;
    	      this.messageVersion = defaults.messageVersion;
    	      this.schemaName = defaults.schemaName;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.senderApplicationQualifier = defaults.senderApplicationQualifier;
        }

        public Builder setAssociationAssignedCode(@Nullable String associationAssignedCode) {
            this.associationAssignedCode = associationAssignedCode;
            return this;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder setMessageRelease(String messageRelease) {
            this.messageRelease = Objects.requireNonNull(messageRelease);
            return this;
        }

        public Builder setMessageVersion(String messageVersion) {
            this.messageVersion = Objects.requireNonNull(messageVersion);
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder setSenderApplicationId(@Nullable String senderApplicationId) {
            this.senderApplicationId = senderApplicationId;
            return this;
        }

        public Builder setSenderApplicationQualifier(@Nullable String senderApplicationQualifier) {
            this.senderApplicationQualifier = senderApplicationQualifier;
            return this;
        }

        public EdifactSchemaReferenceResponse build() {
            return new EdifactSchemaReferenceResponse(associationAssignedCode, messageId, messageRelease, messageVersion, schemaName, senderApplicationId, senderApplicationQualifier);
        }
    }
}
