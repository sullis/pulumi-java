// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.inputs;

import io.pulumi.azurenative.dbforpostgresql.enums.InfrastructureEncryption;
import io.pulumi.azurenative.dbforpostgresql.enums.MinimalTlsVersionEnum;
import io.pulumi.azurenative.dbforpostgresql.enums.PublicNetworkAccessEnum;
import io.pulumi.azurenative.dbforpostgresql.enums.ServerVersion;
import io.pulumi.azurenative.dbforpostgresql.enums.SslEnforcementEnum;
import io.pulumi.azurenative.dbforpostgresql.inputs.StorageProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties used to create a new server.
 * 
 */
public final class ServerPropertiesForDefaultCreateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerPropertiesForDefaultCreateArgs Empty = new ServerPropertiesForDefaultCreateArgs();

    /**
     * The administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    @InputImport(name="administratorLogin", required=true)
    private final Input<String> administratorLogin;

    public Input<String> getAdministratorLogin() {
        return this.administratorLogin;
    }

    /**
     * The password of the administrator login.
     * 
     */
    @InputImport(name="administratorLoginPassword", required=true)
    private final Input<String> administratorLoginPassword;

    public Input<String> getAdministratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * The mode to create a new server.
     * Expected value is 'Default'.
     * 
     */
    @InputImport(name="createMode", required=true)
    private final Input<String> createMode;

    public Input<String> getCreateMode() {
        return this.createMode;
    }

    /**
     * Status showing whether the server enabled infrastructure encryption.
     * 
     */
    @InputImport(name="infrastructureEncryption")
    private final @Nullable Input<Either<String,InfrastructureEncryption>> infrastructureEncryption;

    public Input<Either<String,InfrastructureEncryption>> getInfrastructureEncryption() {
        return this.infrastructureEncryption == null ? Input.empty() : this.infrastructureEncryption;
    }

    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @InputImport(name="minimalTlsVersion")
    private final @Nullable Input<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;

    public Input<Either<String,MinimalTlsVersionEnum>> getMinimalTlsVersion() {
        return this.minimalTlsVersion == null ? Input.empty() : this.minimalTlsVersion;
    }

    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccessEnum>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @InputImport(name="sslEnforcement")
    private final @Nullable Input<SslEnforcementEnum> sslEnforcement;

    public Input<SslEnforcementEnum> getSslEnforcement() {
        return this.sslEnforcement == null ? Input.empty() : this.sslEnforcement;
    }

    /**
     * Storage profile of a server.
     * 
     */
    @InputImport(name="storageProfile")
    private final @Nullable Input<StorageProfileArgs> storageProfile;

    public Input<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Input.empty() : this.storageProfile;
    }

    /**
     * Server version.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<Either<String,ServerVersion>> version;

    public Input<Either<String,ServerVersion>> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ServerPropertiesForDefaultCreateArgs(
        Input<String> administratorLogin,
        Input<String> administratorLoginPassword,
        Input<String> createMode,
        @Nullable Input<Either<String,InfrastructureEncryption>> infrastructureEncryption,
        @Nullable Input<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion,
        @Nullable Input<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess,
        @Nullable Input<SslEnforcementEnum> sslEnforcement,
        @Nullable Input<StorageProfileArgs> storageProfile,
        @Nullable Input<Either<String,ServerVersion>> version) {
        this.administratorLogin = Objects.requireNonNull(administratorLogin, "expected parameter 'administratorLogin' to be non-null");
        this.administratorLoginPassword = Objects.requireNonNull(administratorLoginPassword, "expected parameter 'administratorLoginPassword' to be non-null");
        this.createMode = Objects.requireNonNull(createMode, "expected parameter 'createMode' to be non-null");
        this.infrastructureEncryption = infrastructureEncryption;
        this.minimalTlsVersion = minimalTlsVersion;
        this.publicNetworkAccess = publicNetworkAccess;
        this.sslEnforcement = sslEnforcement;
        this.storageProfile = storageProfile;
        this.version = version;
    }

    private ServerPropertiesForDefaultCreateArgs() {
        this.administratorLogin = Input.empty();
        this.administratorLoginPassword = Input.empty();
        this.createMode = Input.empty();
        this.infrastructureEncryption = Input.empty();
        this.minimalTlsVersion = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.sslEnforcement = Input.empty();
        this.storageProfile = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPropertiesForDefaultCreateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> administratorLogin;
        private Input<String> administratorLoginPassword;
        private Input<String> createMode;
        private @Nullable Input<Either<String,InfrastructureEncryption>> infrastructureEncryption;
        private @Nullable Input<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;
        private @Nullable Input<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;
        private @Nullable Input<SslEnforcementEnum> sslEnforcement;
        private @Nullable Input<StorageProfileArgs> storageProfile;
        private @Nullable Input<Either<String,ServerVersion>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPropertiesForDefaultCreateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administratorLoginPassword = defaults.administratorLoginPassword;
    	      this.createMode = defaults.createMode;
    	      this.infrastructureEncryption = defaults.infrastructureEncryption;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.sslEnforcement = defaults.sslEnforcement;
    	      this.storageProfile = defaults.storageProfile;
    	      this.version = defaults.version;
        }

        public Builder setAdministratorLogin(Input<String> administratorLogin) {
            this.administratorLogin = Objects.requireNonNull(administratorLogin);
            return this;
        }

        public Builder setAdministratorLogin(String administratorLogin) {
            this.administratorLogin = Input.of(Objects.requireNonNull(administratorLogin));
            return this;
        }

        public Builder setAdministratorLoginPassword(Input<String> administratorLoginPassword) {
            this.administratorLoginPassword = Objects.requireNonNull(administratorLoginPassword);
            return this;
        }

        public Builder setAdministratorLoginPassword(String administratorLoginPassword) {
            this.administratorLoginPassword = Input.of(Objects.requireNonNull(administratorLoginPassword));
            return this;
        }

        public Builder setCreateMode(Input<String> createMode) {
            this.createMode = Objects.requireNonNull(createMode);
            return this;
        }

        public Builder setCreateMode(String createMode) {
            this.createMode = Input.of(Objects.requireNonNull(createMode));
            return this;
        }

        public Builder setInfrastructureEncryption(@Nullable Input<Either<String,InfrastructureEncryption>> infrastructureEncryption) {
            this.infrastructureEncryption = infrastructureEncryption;
            return this;
        }

        public Builder setInfrastructureEncryption(@Nullable Either<String,InfrastructureEncryption> infrastructureEncryption) {
            this.infrastructureEncryption = Input.ofNullable(infrastructureEncryption);
            return this;
        }

        public Builder setMinimalTlsVersion(@Nullable Input<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }

        public Builder setMinimalTlsVersion(@Nullable Either<String,MinimalTlsVersionEnum> minimalTlsVersion) {
            this.minimalTlsVersion = Input.ofNullable(minimalTlsVersion);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccessEnum> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder setSslEnforcement(@Nullable Input<SslEnforcementEnum> sslEnforcement) {
            this.sslEnforcement = sslEnforcement;
            return this;
        }

        public Builder setSslEnforcement(@Nullable SslEnforcementEnum sslEnforcement) {
            this.sslEnforcement = Input.ofNullable(sslEnforcement);
            return this;
        }

        public Builder setStorageProfile(@Nullable Input<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Input.ofNullable(storageProfile);
            return this;
        }

        public Builder setVersion(@Nullable Input<Either<String,ServerVersion>> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Either<String,ServerVersion> version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public ServerPropertiesForDefaultCreateArgs build() {
            return new ServerPropertiesForDefaultCreateArgs(administratorLogin, administratorLoginPassword, createMode, infrastructureEncryption, minimalTlsVersion, publicNetworkAccess, sslEnforcement, storageProfile, version);
        }
    }
}
