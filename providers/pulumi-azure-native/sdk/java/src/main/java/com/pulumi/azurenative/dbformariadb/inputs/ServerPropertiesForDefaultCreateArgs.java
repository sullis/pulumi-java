// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformariadb.inputs;

import com.pulumi.azurenative.dbformariadb.enums.MinimalTlsVersionEnum;
import com.pulumi.azurenative.dbformariadb.enums.PublicNetworkAccessEnum;
import com.pulumi.azurenative.dbformariadb.enums.ServerVersion;
import com.pulumi.azurenative.dbformariadb.enums.SslEnforcementEnum;
import com.pulumi.azurenative.dbformariadb.inputs.StorageProfileArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties used to create a new server.
 * 
 */
public final class ServerPropertiesForDefaultCreateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerPropertiesForDefaultCreateArgs Empty = new ServerPropertiesForDefaultCreateArgs();

    /**
     * The administrator&#39;s login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    @Import(name="administratorLogin", required=true)
    private Output<String> administratorLogin;

    /**
     * @return The administrator&#39;s login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    public Output<String> administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * The password of the administrator login.
     * 
     */
    @Import(name="administratorLoginPassword", required=true)
    private Output<String> administratorLoginPassword;

    /**
     * @return The password of the administrator login.
     * 
     */
    public Output<String> administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * The mode to create a new server.
     * Expected value is &#39;Default&#39;.
     * 
     */
    @Import(name="createMode", required=true)
    private Output<String> createMode;

    /**
     * @return The mode to create a new server.
     * Expected value is &#39;Default&#39;.
     * 
     */
    public Output<String> createMode() {
        return this.createMode;
    }

    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @Import(name="minimalTlsVersion")
    private @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;

    /**
     * @return Enforce a minimal Tls version for the server.
     * 
     */
    public Optional<Output<Either<String,MinimalTlsVersionEnum>>> minimalTlsVersion() {
        return Optional.ofNullable(this.minimalTlsVersion);
    }

    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;

    /**
     * @return Whether or not public network access is allowed for this server. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Optional<Output<Either<String,PublicNetworkAccessEnum>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @Import(name="sslEnforcement")
    private @Nullable Output<SslEnforcementEnum> sslEnforcement;

    /**
     * @return Enable ssl enforcement or not when connect to server.
     * 
     */
    public Optional<Output<SslEnforcementEnum>> sslEnforcement() {
        return Optional.ofNullable(this.sslEnforcement);
    }

    /**
     * Storage profile of a server.
     * 
     */
    @Import(name="storageProfile")
    private @Nullable Output<StorageProfileArgs> storageProfile;

    /**
     * @return Storage profile of a server.
     * 
     */
    public Optional<Output<StorageProfileArgs>> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }

    /**
     * Server version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Either<String,ServerVersion>> version;

    /**
     * @return Server version.
     * 
     */
    public Optional<Output<Either<String,ServerVersion>>> version() {
        return Optional.ofNullable(this.version);
    }

    private ServerPropertiesForDefaultCreateArgs() {}

    private ServerPropertiesForDefaultCreateArgs(ServerPropertiesForDefaultCreateArgs $) {
        this.administratorLogin = $.administratorLogin;
        this.administratorLoginPassword = $.administratorLoginPassword;
        this.createMode = $.createMode;
        this.minimalTlsVersion = $.minimalTlsVersion;
        this.publicNetworkAccess = $.publicNetworkAccess;
        this.sslEnforcement = $.sslEnforcement;
        this.storageProfile = $.storageProfile;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerPropertiesForDefaultCreateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerPropertiesForDefaultCreateArgs $;

        public Builder() {
            $ = new ServerPropertiesForDefaultCreateArgs();
        }

        public Builder(ServerPropertiesForDefaultCreateArgs defaults) {
            $ = new ServerPropertiesForDefaultCreateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorLogin The administrator&#39;s login name of a server. Can only be specified when the server is being created (and is required for creation).
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(Output<String> administratorLogin) {
            $.administratorLogin = administratorLogin;
            return this;
        }

        /**
         * @param administratorLogin The administrator&#39;s login name of a server. Can only be specified when the server is being created (and is required for creation).
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(String administratorLogin) {
            return administratorLogin(Output.of(administratorLogin));
        }

        /**
         * @param administratorLoginPassword The password of the administrator login.
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(Output<String> administratorLoginPassword) {
            $.administratorLoginPassword = administratorLoginPassword;
            return this;
        }

        /**
         * @param administratorLoginPassword The password of the administrator login.
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(String administratorLoginPassword) {
            return administratorLoginPassword(Output.of(administratorLoginPassword));
        }

        /**
         * @param createMode The mode to create a new server.
         * Expected value is &#39;Default&#39;.
         * 
         * @return builder
         * 
         */
        public Builder createMode(Output<String> createMode) {
            $.createMode = createMode;
            return this;
        }

        /**
         * @param createMode The mode to create a new server.
         * Expected value is &#39;Default&#39;.
         * 
         * @return builder
         * 
         */
        public Builder createMode(String createMode) {
            return createMode(Output.of(createMode));
        }

        /**
         * @param minimalTlsVersion Enforce a minimal Tls version for the server.
         * 
         * @return builder
         * 
         */
        public Builder minimalTlsVersion(@Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion) {
            $.minimalTlsVersion = minimalTlsVersion;
            return this;
        }

        /**
         * @param minimalTlsVersion Enforce a minimal Tls version for the server.
         * 
         * @return builder
         * 
         */
        public Builder minimalTlsVersion(Either<String,MinimalTlsVersionEnum> minimalTlsVersion) {
            return minimalTlsVersion(Output.of(minimalTlsVersion));
        }

        /**
         * @param minimalTlsVersion Enforce a minimal Tls version for the server.
         * 
         * @return builder
         * 
         */
        public Builder minimalTlsVersion(String minimalTlsVersion) {
            return minimalTlsVersion(Either.ofLeft(minimalTlsVersion));
        }

        /**
         * @param minimalTlsVersion Enforce a minimal Tls version for the server.
         * 
         * @return builder
         * 
         */
        public Builder minimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
            return minimalTlsVersion(Either.ofRight(minimalTlsVersion));
        }

        /**
         * @param publicNetworkAccess Whether or not public network access is allowed for this server. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        /**
         * @param publicNetworkAccess Whether or not public network access is allowed for this server. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(Either<String,PublicNetworkAccessEnum> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether or not public network access is allowed for this server. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(String publicNetworkAccess) {
            return publicNetworkAccess(Either.ofLeft(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether or not public network access is allowed for this server. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
            return publicNetworkAccess(Either.ofRight(publicNetworkAccess));
        }

        /**
         * @param sslEnforcement Enable ssl enforcement or not when connect to server.
         * 
         * @return builder
         * 
         */
        public Builder sslEnforcement(@Nullable Output<SslEnforcementEnum> sslEnforcement) {
            $.sslEnforcement = sslEnforcement;
            return this;
        }

        /**
         * @param sslEnforcement Enable ssl enforcement or not when connect to server.
         * 
         * @return builder
         * 
         */
        public Builder sslEnforcement(SslEnforcementEnum sslEnforcement) {
            return sslEnforcement(Output.of(sslEnforcement));
        }

        /**
         * @param storageProfile Storage profile of a server.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        /**
         * @param storageProfile Storage profile of a server.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(StorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        /**
         * @param version Server version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Either<String,ServerVersion>> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Server version.
         * 
         * @return builder
         * 
         */
        public Builder version(Either<String,ServerVersion> version) {
            return version(Output.of(version));
        }

        /**
         * @param version Server version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Either.ofLeft(version));
        }

        /**
         * @param version Server version.
         * 
         * @return builder
         * 
         */
        public Builder version(ServerVersion version) {
            return version(Either.ofRight(version));
        }

        public ServerPropertiesForDefaultCreateArgs build() {
            $.administratorLogin = Objects.requireNonNull($.administratorLogin, "expected parameter 'administratorLogin' to be non-null");
            $.administratorLoginPassword = Objects.requireNonNull($.administratorLoginPassword, "expected parameter 'administratorLoginPassword' to be non-null");
            $.createMode = Codegen.stringProp("createMode").output().arg($.createMode).require();
            return $;
        }
    }

}
