// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.TransparentDataEncryptionStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransparentDataEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransparentDataEncryptionArgs Empty = new TransparentDataEncryptionArgs();

    /**
     * The name of the database for which setting the transparent data encryption applies.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database for which setting the transparent data encryption applies.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The status of the database transparent data encryption.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,TransparentDataEncryptionStatus>> status;

    /**
     * @return The status of the database transparent data encryption.
     * 
     */
    public Optional<Output<Either<String,TransparentDataEncryptionStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The name of the transparent data encryption configuration.
     * 
     */
    @Import(name="transparentDataEncryptionName")
    private @Nullable Output<String> transparentDataEncryptionName;

    /**
     * @return The name of the transparent data encryption configuration.
     * 
     */
    public Optional<Output<String>> transparentDataEncryptionName() {
        return Optional.ofNullable(this.transparentDataEncryptionName);
    }

    private TransparentDataEncryptionArgs() {}

    private TransparentDataEncryptionArgs(TransparentDataEncryptionArgs $) {
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.status = $.status;
        this.transparentDataEncryptionName = $.transparentDataEncryptionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransparentDataEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransparentDataEncryptionArgs $;

        public Builder() {
            $ = new TransparentDataEncryptionArgs();
        }

        public Builder(TransparentDataEncryptionArgs defaults) {
            $ = new TransparentDataEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database for which setting the transparent data encryption applies.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database for which setting the transparent data encryption applies.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param status The status of the database transparent data encryption.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,TransparentDataEncryptionStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the database transparent data encryption.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,TransparentDataEncryptionStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status The status of the database transparent data encryption.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status The status of the database transparent data encryption.
         * 
         * @return builder
         * 
         */
        public Builder status(TransparentDataEncryptionStatus status) {
            return status(Either.ofRight(status));
        }

        /**
         * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
         * 
         * @return builder
         * 
         */
        public Builder transparentDataEncryptionName(@Nullable Output<String> transparentDataEncryptionName) {
            $.transparentDataEncryptionName = transparentDataEncryptionName;
            return this;
        }

        /**
         * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
         * 
         * @return builder
         * 
         */
        public Builder transparentDataEncryptionName(String transparentDataEncryptionName) {
            return transparentDataEncryptionName(Output.of(transparentDataEncryptionName));
        }

        public TransparentDataEncryptionArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
