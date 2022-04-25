// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the Batch account.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * A value indicating whether packages within the application may be overwritten using the same version string.
     * 
     */
    @Import(name="allowUpdates")
    private @Nullable Output<Boolean> allowUpdates;

    /**
     * @return A value indicating whether packages within the application may be overwritten using the same version string.
     * 
     */
    public Optional<Output<Boolean>> allowUpdates() {
        return Optional.ofNullable(this.allowUpdates);
    }

    /**
     * The name of the application. This must be unique within the account.
     * 
     */
    @Import(name="applicationName")
    private @Nullable Output<String> applicationName;

    /**
     * @return The name of the application. This must be unique within the account.
     * 
     */
    public Optional<Output<String>> applicationName() {
        return Optional.ofNullable(this.applicationName);
    }

    /**
     * The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
     * 
     */
    @Import(name="defaultVersion")
    private @Nullable Output<String> defaultVersion;

    /**
     * @return The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
     * 
     */
    public Optional<Output<String>> defaultVersion() {
        return Optional.ofNullable(this.defaultVersion);
    }

    /**
     * The display name for the application.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name for the application.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the Batch account.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ApplicationArgs() {}

    private ApplicationArgs(ApplicationArgs $) {
        this.accountName = $.accountName;
        this.allowUpdates = $.allowUpdates;
        this.applicationName = $.applicationName;
        this.defaultVersion = $.defaultVersion;
        this.displayName = $.displayName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationArgs $;

        public Builder() {
            $ = new ApplicationArgs();
        }

        public Builder(ApplicationArgs defaults) {
            $ = new ApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param allowUpdates A value indicating whether packages within the application may be overwritten using the same version string.
         * 
         * @return builder
         * 
         */
        public Builder allowUpdates(@Nullable Output<Boolean> allowUpdates) {
            $.allowUpdates = allowUpdates;
            return this;
        }

        /**
         * @param allowUpdates A value indicating whether packages within the application may be overwritten using the same version string.
         * 
         * @return builder
         * 
         */
        public Builder allowUpdates(Boolean allowUpdates) {
            return allowUpdates(Output.of(allowUpdates));
        }

        /**
         * @param applicationName The name of the application. This must be unique within the account.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(@Nullable Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName The name of the application. This must be unique within the account.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param defaultVersion The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
         * 
         * @return builder
         * 
         */
        public Builder defaultVersion(@Nullable Output<String> defaultVersion) {
            $.defaultVersion = defaultVersion;
            return this;
        }

        /**
         * @param defaultVersion The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
         * 
         * @return builder
         * 
         */
        public Builder defaultVersion(String defaultVersion) {
            return defaultVersion(Output.of(defaultVersion));
        }

        /**
         * @param displayName The display name for the application.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name for the application.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ApplicationArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
