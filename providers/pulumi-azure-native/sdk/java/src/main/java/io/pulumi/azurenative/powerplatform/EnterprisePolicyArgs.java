// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform;

import io.pulumi.azurenative.powerplatform.enums.EnterprisePolicyKind;
import io.pulumi.azurenative.powerplatform.inputs.EnterprisePolicyIdentityArgs;
import io.pulumi.azurenative.powerplatform.inputs.PropertiesEncryptionArgs;
import io.pulumi.azurenative.powerplatform.inputs.PropertiesLockboxArgs;
import io.pulumi.azurenative.powerplatform.inputs.PropertiesNetworkInjectionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterprisePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterprisePolicyArgs Empty = new EnterprisePolicyArgs();

    /**
     * The encryption settings for a configuration store.
     * 
     */
    @Import(name="encryption")
      private final @Nullable Output<PropertiesEncryptionArgs> encryption;

    public Output<PropertiesEncryptionArgs> getEncryption() {
        return this.encryption == null ? Output.empty() : this.encryption;
    }

    /**
     * Name of the EnterprisePolicy.
     * 
     */
    @Import(name="enterprisePolicyName")
      private final @Nullable Output<String> enterprisePolicyName;

    public Output<String> getEnterprisePolicyName() {
        return this.enterprisePolicyName == null ? Output.empty() : this.enterprisePolicyName;
    }

    /**
     * The identity of the EnterprisePolicy.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<EnterprisePolicyIdentityArgs> identity;

    public Output<EnterprisePolicyIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * The kind (type) of Enterprise Policy.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,EnterprisePolicyKind>> kind;

    public Output<Either<String,EnterprisePolicyKind>> getKind() {
        return this.kind;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Settings concerning lockbox.
     * 
     */
    @Import(name="lockbox")
      private final @Nullable Output<PropertiesLockboxArgs> lockbox;

    public Output<PropertiesLockboxArgs> getLockbox() {
        return this.lockbox == null ? Output.empty() : this.lockbox;
    }

    /**
     * Settings concerning network injection.
     * 
     */
    @Import(name="networkInjection")
      private final @Nullable Output<PropertiesNetworkInjectionArgs> networkInjection;

    public Output<PropertiesNetworkInjectionArgs> getNetworkInjection() {
        return this.networkInjection == null ? Output.empty() : this.networkInjection;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public EnterprisePolicyArgs(
        @Nullable Output<PropertiesEncryptionArgs> encryption,
        @Nullable Output<String> enterprisePolicyName,
        @Nullable Output<EnterprisePolicyIdentityArgs> identity,
        Output<Either<String,EnterprisePolicyKind>> kind,
        @Nullable Output<String> location,
        @Nullable Output<PropertiesLockboxArgs> lockbox,
        @Nullable Output<PropertiesNetworkInjectionArgs> networkInjection,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.encryption = encryption;
        this.enterprisePolicyName = enterprisePolicyName;
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.lockbox = lockbox;
        this.networkInjection = networkInjection;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private EnterprisePolicyArgs() {
        this.encryption = Output.empty();
        this.enterprisePolicyName = Output.empty();
        this.identity = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.lockbox = Output.empty();
        this.networkInjection = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterprisePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PropertiesEncryptionArgs> encryption;
        private @Nullable Output<String> enterprisePolicyName;
        private @Nullable Output<EnterprisePolicyIdentityArgs> identity;
        private Output<Either<String,EnterprisePolicyKind>> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<PropertiesLockboxArgs> lockbox;
        private @Nullable Output<PropertiesNetworkInjectionArgs> networkInjection;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterprisePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.enterprisePolicyName = defaults.enterprisePolicyName;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.lockbox = defaults.lockbox;
    	      this.networkInjection = defaults.networkInjection;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder encryption(@Nullable Output<PropertiesEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable PropertiesEncryptionArgs encryption) {
            this.encryption = Output.ofNullable(encryption);
            return this;
        }
        public Builder enterprisePolicyName(@Nullable Output<String> enterprisePolicyName) {
            this.enterprisePolicyName = enterprisePolicyName;
            return this;
        }
        public Builder enterprisePolicyName(@Nullable String enterprisePolicyName) {
            this.enterprisePolicyName = Output.ofNullable(enterprisePolicyName);
            return this;
        }
        public Builder identity(@Nullable Output<EnterprisePolicyIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable EnterprisePolicyIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }
        public Builder kind(Output<Either<String,EnterprisePolicyKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,EnterprisePolicyKind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder lockbox(@Nullable Output<PropertiesLockboxArgs> lockbox) {
            this.lockbox = lockbox;
            return this;
        }
        public Builder lockbox(@Nullable PropertiesLockboxArgs lockbox) {
            this.lockbox = Output.ofNullable(lockbox);
            return this;
        }
        public Builder networkInjection(@Nullable Output<PropertiesNetworkInjectionArgs> networkInjection) {
            this.networkInjection = networkInjection;
            return this;
        }
        public Builder networkInjection(@Nullable PropertiesNetworkInjectionArgs networkInjection) {
            this.networkInjection = Output.ofNullable(networkInjection);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public EnterprisePolicyArgs build() {
            return new EnterprisePolicyArgs(encryption, enterprisePolicyName, identity, kind, location, lockbox, networkInjection, resourceGroupName, tags);
        }
    }
}
