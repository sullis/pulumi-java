// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 schema reference.
 * 
 */
public final class X12SchemaReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12SchemaReferenceResponse Empty = new X12SchemaReferenceResponse();

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
     * The schema name.
     * 
     */
    @InputImport(name="schemaName", required=true)
      private final String schemaName;

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * The schema version.
     * 
     */
    @InputImport(name="schemaVersion", required=true)
      private final String schemaVersion;

    public String getSchemaVersion() {
        return this.schemaVersion;
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

    public X12SchemaReferenceResponse(
        String messageId,
        String schemaName,
        String schemaVersion,
        @Nullable String senderApplicationId) {
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.schemaVersion = Objects.requireNonNull(schemaVersion, "expected parameter 'schemaVersion' to be non-null");
        this.senderApplicationId = senderApplicationId;
    }

    private X12SchemaReferenceResponse() {
        this.messageId = null;
        this.schemaName = null;
        this.schemaVersion = null;
        this.senderApplicationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12SchemaReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageId;
        private String schemaName;
        private String schemaVersion;
        private @Nullable String senderApplicationId;

        public Builder() {
    	      // Empty
        }

        public Builder(X12SchemaReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
    	      this.schemaName = defaults.schemaName;
    	      this.schemaVersion = defaults.schemaVersion;
    	      this.senderApplicationId = defaults.senderApplicationId;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder setSchemaVersion(String schemaVersion) {
            this.schemaVersion = Objects.requireNonNull(schemaVersion);
            return this;
        }

        public Builder setSenderApplicationId(@Nullable String senderApplicationId) {
            this.senderApplicationId = senderApplicationId;
            return this;
        }
        public X12SchemaReferenceResponse build() {
            return new X12SchemaReferenceResponse(messageId, schemaName, schemaVersion, senderApplicationId);
        }
    }
}