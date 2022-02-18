// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The X12 schema reference.
 * 
 */
public final class X12SchemaReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12SchemaReferenceArgs Empty = new X12SchemaReferenceArgs();

    /**
     * The message id.
     * 
     */
    @InputImport(name="messageId", required=true)
    private final Input<String> messageId;

    public Input<String> getMessageId() {
        return this.messageId;
    }

    /**
     * The schema name.
     * 
     */
    @InputImport(name="schemaName", required=true)
    private final Input<String> schemaName;

    public Input<String> getSchemaName() {
        return this.schemaName;
    }

    /**
     * The schema version.
     * 
     */
    @InputImport(name="schemaVersion", required=true)
    private final Input<String> schemaVersion;

    public Input<String> getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * The sender application id.
     * 
     */
    @InputImport(name="senderApplicationId")
    private final @Nullable Input<String> senderApplicationId;

    public Input<String> getSenderApplicationId() {
        return this.senderApplicationId == null ? Input.empty() : this.senderApplicationId;
    }

    public X12SchemaReferenceArgs(
        Input<String> messageId,
        Input<String> schemaName,
        Input<String> schemaVersion,
        @Nullable Input<String> senderApplicationId) {
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.schemaVersion = Objects.requireNonNull(schemaVersion, "expected parameter 'schemaVersion' to be non-null");
        this.senderApplicationId = senderApplicationId;
    }

    private X12SchemaReferenceArgs() {
        this.messageId = Input.empty();
        this.schemaName = Input.empty();
        this.schemaVersion = Input.empty();
        this.senderApplicationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12SchemaReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> messageId;
        private Input<String> schemaName;
        private Input<String> schemaVersion;
        private @Nullable Input<String> senderApplicationId;

        public Builder() {
    	      // Empty
        }

        public Builder(X12SchemaReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
    	      this.schemaName = defaults.schemaName;
    	      this.schemaVersion = defaults.schemaVersion;
    	      this.senderApplicationId = defaults.senderApplicationId;
        }

        public Builder setMessageId(Input<String> messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Input.of(Objects.requireNonNull(messageId));
            return this;
        }

        public Builder setSchemaName(Input<String> schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Input.of(Objects.requireNonNull(schemaName));
            return this;
        }

        public Builder setSchemaVersion(Input<String> schemaVersion) {
            this.schemaVersion = Objects.requireNonNull(schemaVersion);
            return this;
        }

        public Builder setSchemaVersion(String schemaVersion) {
            this.schemaVersion = Input.of(Objects.requireNonNull(schemaVersion));
            return this;
        }

        public Builder setSenderApplicationId(@Nullable Input<String> senderApplicationId) {
            this.senderApplicationId = senderApplicationId;
            return this;
        }

        public Builder setSenderApplicationId(@Nullable String senderApplicationId) {
            this.senderApplicationId = Input.ofNullable(senderApplicationId);
            return this;
        }

        public X12SchemaReferenceArgs build() {
            return new X12SchemaReferenceArgs(messageId, schemaName, schemaVersion, senderApplicationId);
        }
    }
}
