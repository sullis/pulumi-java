// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact schema reference.
 * 
 */
public final class EdifactSchemaReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final EdifactSchemaReferenceResponse Empty = new EdifactSchemaReferenceResponse();

    /**
     * The association assigned code.
     * 
     */
    @Import(name="associationAssignedCode")
    private @Nullable String associationAssignedCode;

    /**
     * @return The association assigned code.
     * 
     */
    public Optional<String> associationAssignedCode() {
        return Optional.ofNullable(this.associationAssignedCode);
    }

    /**
     * The message id.
     * 
     */
    @Import(name="messageId", required=true)
    private String messageId;

    /**
     * @return The message id.
     * 
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * The message release version.
     * 
     */
    @Import(name="messageRelease", required=true)
    private String messageRelease;

    /**
     * @return The message release version.
     * 
     */
    public String messageRelease() {
        return this.messageRelease;
    }

    /**
     * The message version.
     * 
     */
    @Import(name="messageVersion", required=true)
    private String messageVersion;

    /**
     * @return The message version.
     * 
     */
    public String messageVersion() {
        return this.messageVersion;
    }

    /**
     * The schema name.
     * 
     */
    @Import(name="schemaName", required=true)
    private String schemaName;

    /**
     * @return The schema name.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * The sender application id.
     * 
     */
    @Import(name="senderApplicationId")
    private @Nullable String senderApplicationId;

    /**
     * @return The sender application id.
     * 
     */
    public Optional<String> senderApplicationId() {
        return Optional.ofNullable(this.senderApplicationId);
    }

    /**
     * The sender application qualifier.
     * 
     */
    @Import(name="senderApplicationQualifier")
    private @Nullable String senderApplicationQualifier;

    /**
     * @return The sender application qualifier.
     * 
     */
    public Optional<String> senderApplicationQualifier() {
        return Optional.ofNullable(this.senderApplicationQualifier);
    }

    private EdifactSchemaReferenceResponse() {}

    private EdifactSchemaReferenceResponse(EdifactSchemaReferenceResponse $) {
        this.associationAssignedCode = $.associationAssignedCode;
        this.messageId = $.messageId;
        this.messageRelease = $.messageRelease;
        this.messageVersion = $.messageVersion;
        this.schemaName = $.schemaName;
        this.senderApplicationId = $.senderApplicationId;
        this.senderApplicationQualifier = $.senderApplicationQualifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactSchemaReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactSchemaReferenceResponse $;

        public Builder() {
            $ = new EdifactSchemaReferenceResponse();
        }

        public Builder(EdifactSchemaReferenceResponse defaults) {
            $ = new EdifactSchemaReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param associationAssignedCode The association assigned code.
         * 
         * @return builder
         * 
         */
        public Builder associationAssignedCode(@Nullable String associationAssignedCode) {
            $.associationAssignedCode = associationAssignedCode;
            return this;
        }

        /**
         * @param messageId The message id.
         * 
         * @return builder
         * 
         */
        public Builder messageId(String messageId) {
            $.messageId = messageId;
            return this;
        }

        /**
         * @param messageRelease The message release version.
         * 
         * @return builder
         * 
         */
        public Builder messageRelease(String messageRelease) {
            $.messageRelease = messageRelease;
            return this;
        }

        /**
         * @param messageVersion The message version.
         * 
         * @return builder
         * 
         */
        public Builder messageVersion(String messageVersion) {
            $.messageVersion = messageVersion;
            return this;
        }

        /**
         * @param schemaName The schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param senderApplicationId The sender application id.
         * 
         * @return builder
         * 
         */
        public Builder senderApplicationId(@Nullable String senderApplicationId) {
            $.senderApplicationId = senderApplicationId;
            return this;
        }

        /**
         * @param senderApplicationQualifier The sender application qualifier.
         * 
         * @return builder
         * 
         */
        public Builder senderApplicationQualifier(@Nullable String senderApplicationQualifier) {
            $.senderApplicationQualifier = senderApplicationQualifier;
            return this;
        }

        public EdifactSchemaReferenceResponse build() {
            $.messageId = Objects.requireNonNull($.messageId, "expected parameter 'messageId' to be non-null");
            $.messageRelease = Objects.requireNonNull($.messageRelease, "expected parameter 'messageRelease' to be non-null");
            $.messageVersion = Objects.requireNonNull($.messageVersion, "expected parameter 'messageVersion' to be non-null");
            $.schemaName = Objects.requireNonNull($.schemaName, "expected parameter 'schemaName' to be non-null");
            return $;
        }
    }

}
