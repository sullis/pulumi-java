// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.KeyType;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListIntegrationAccountSchemaContentCallbackUrlPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListIntegrationAccountSchemaContentCallbackUrlPlainArgs Empty = new ListIntegrationAccountSchemaContentCallbackUrlPlainArgs();

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private String integrationAccountName;

    /**
     * @return The integration account name.
     * 
     */
    public String integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The key type.
     * 
     */
    @Import(name="keyType")
    private @Nullable Either<String,KeyType> keyType;

    /**
     * @return The key type.
     * 
     */
    public Optional<Either<String,KeyType>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * The expiry time.
     * 
     */
    @Import(name="notAfter")
    private @Nullable String notAfter;

    /**
     * @return The expiry time.
     * 
     */
    public Optional<String> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The integration account schema name.
     * 
     */
    @Import(name="schemaName", required=true)
    private String schemaName;

    /**
     * @return The integration account schema name.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }

    private ListIntegrationAccountSchemaContentCallbackUrlPlainArgs() {}

    private ListIntegrationAccountSchemaContentCallbackUrlPlainArgs(ListIntegrationAccountSchemaContentCallbackUrlPlainArgs $) {
        this.integrationAccountName = $.integrationAccountName;
        this.keyType = $.keyType;
        this.notAfter = $.notAfter;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaName = $.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListIntegrationAccountSchemaContentCallbackUrlPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListIntegrationAccountSchemaContentCallbackUrlPlainArgs $;

        public Builder() {
            $ = new ListIntegrationAccountSchemaContentCallbackUrlPlainArgs();
        }

        public Builder(ListIntegrationAccountSchemaContentCallbackUrlPlainArgs defaults) {
            $ = new ListIntegrationAccountSchemaContentCallbackUrlPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param keyType The key type.
         * 
         * @return builder
         * 
         */
        public Builder keyType(@Nullable Either<String,KeyType> keyType) {
            $.keyType = keyType;
            return this;
        }

        /**
         * @param keyType The key type.
         * 
         * @return builder
         * 
         */
        public Builder keyType(String keyType) {
            return keyType(Either.ofLeft(keyType));
        }

        /**
         * @param keyType The key type.
         * 
         * @return builder
         * 
         */
        public Builder keyType(KeyType keyType) {
            return keyType(Either.ofRight(keyType));
        }

        /**
         * @param notAfter The expiry time.
         * 
         * @return builder
         * 
         */
        public Builder notAfter(@Nullable String notAfter) {
            $.notAfter = notAfter;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param schemaName The integration account schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public ListIntegrationAccountSchemaContentCallbackUrlPlainArgs build() {
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.schemaName = Objects.requireNonNull($.schemaName, "expected parameter 'schemaName' to be non-null");
            return $;
        }
    }

}
