// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The Availability Zone in which to create your
     * instance (see list below)
     * 
     */
    @Import(name="availabilityZone", required=true)
      private final Output<String> availabilityZone;

    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
     * 
     */
    @Import(name="blueprintId", required=true)
      private final Output<String> blueprintId;

    public Output<String> blueprintId() {
        return this.blueprintId;
    }

    /**
     * The bundle of specification information (see list below)
     * 
     */
    @Import(name="bundleId", required=true)
      private final Output<String> bundleId;

    public Output<String> bundleId() {
        return this.bundleId;
    }

    /**
     * The name of your key pair. Created in the
     * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
     * 
     */
    @Import(name="keyPairName")
      private final @Nullable Output<String> keyPairName;

    public Output<String> keyPairName() {
        return this.keyPairName == null ? Codegen.empty() : this.keyPairName;
    }

    /**
     * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * launch script to configure server with additional user data
     * 
     */
    @Import(name="userData")
      private final @Nullable Output<String> userData;

    public Output<String> userData() {
        return this.userData == null ? Codegen.empty() : this.userData;
    }

    public InstanceArgs(
        Output<String> availabilityZone,
        Output<String> blueprintId,
        Output<String> bundleId,
        @Nullable Output<String> keyPairName,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> userData) {
        this.availabilityZone = Objects.requireNonNull(availabilityZone, "expected parameter 'availabilityZone' to be non-null");
        this.blueprintId = Objects.requireNonNull(blueprintId, "expected parameter 'blueprintId' to be non-null");
        this.bundleId = Objects.requireNonNull(bundleId, "expected parameter 'bundleId' to be non-null");
        this.keyPairName = keyPairName;
        this.name = name;
        this.tags = tags;
        this.userData = userData;
    }

    private InstanceArgs() {
        this.availabilityZone = Codegen.empty();
        this.blueprintId = Codegen.empty();
        this.bundleId = Codegen.empty();
        this.keyPairName = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
        this.userData = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> availabilityZone;
        private Output<String> blueprintId;
        private Output<String> bundleId;
        private @Nullable Output<String> keyPairName;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> userData;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.blueprintId = defaults.blueprintId;
    	      this.bundleId = defaults.bundleId;
    	      this.keyPairName = defaults.keyPairName;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
        }

        public Builder availabilityZone(Output<String> availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Output.of(Objects.requireNonNull(availabilityZone));
            return this;
        }
        public Builder blueprintId(Output<String> blueprintId) {
            this.blueprintId = Objects.requireNonNull(blueprintId);
            return this;
        }
        public Builder blueprintId(String blueprintId) {
            this.blueprintId = Output.of(Objects.requireNonNull(blueprintId));
            return this;
        }
        public Builder bundleId(Output<String> bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
            return this;
        }
        public Builder bundleId(String bundleId) {
            this.bundleId = Output.of(Objects.requireNonNull(bundleId));
            return this;
        }
        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public Builder keyPairName(@Nullable String keyPairName) {
            this.keyPairName = Codegen.ofNullable(keyPairName);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder userData(@Nullable Output<String> userData) {
            this.userData = userData;
            return this;
        }
        public Builder userData(@Nullable String userData) {
            this.userData = Codegen.ofNullable(userData);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(availabilityZone, blueprintId, bundleId, keyPairName, name, tags, userData);
        }
    }
}
