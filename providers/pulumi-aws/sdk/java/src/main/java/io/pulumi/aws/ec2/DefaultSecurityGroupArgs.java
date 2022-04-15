// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.DefaultSecurityGroupEgressArgs;
import io.pulumi.aws.ec2.inputs.DefaultSecurityGroupIngressArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultSecurityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultSecurityGroupArgs Empty = new DefaultSecurityGroupArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="egress")
      private final @Nullable Output<List<DefaultSecurityGroupEgressArgs>> egress;

    public Output<List<DefaultSecurityGroupEgressArgs>> egress() {
        return this.egress == null ? Codegen.empty() : this.egress;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="ingress")
      private final @Nullable Output<List<DefaultSecurityGroupIngressArgs>> ingress;

    public Output<List<DefaultSecurityGroupIngressArgs>> ingress() {
        return this.ingress == null ? Codegen.empty() : this.ingress;
    }

    @Import(name="revokeRulesOnDelete")
      private final @Nullable Output<Boolean> revokeRulesOnDelete;

    public Output<Boolean> revokeRulesOnDelete() {
        return this.revokeRulesOnDelete == null ? Codegen.empty() : this.revokeRulesOnDelete;
    }

    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public DefaultSecurityGroupArgs(
        @Nullable Output<List<DefaultSecurityGroupEgressArgs>> egress,
        @Nullable Output<List<DefaultSecurityGroupIngressArgs>> ingress,
        @Nullable Output<Boolean> revokeRulesOnDelete,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vpcId) {
        this.egress = egress;
        this.ingress = ingress;
        this.revokeRulesOnDelete = revokeRulesOnDelete;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    private DefaultSecurityGroupArgs() {
        this.egress = Codegen.empty();
        this.ingress = Codegen.empty();
        this.revokeRulesOnDelete = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DefaultSecurityGroupEgressArgs>> egress;
        private @Nullable Output<List<DefaultSecurityGroupIngressArgs>> ingress;
        private @Nullable Output<Boolean> revokeRulesOnDelete;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egress = defaults.egress;
    	      this.ingress = defaults.ingress;
    	      this.revokeRulesOnDelete = defaults.revokeRulesOnDelete;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder egress(@Nullable Output<List<DefaultSecurityGroupEgressArgs>> egress) {
            this.egress = egress;
            return this;
        }
        public Builder egress(@Nullable List<DefaultSecurityGroupEgressArgs> egress) {
            this.egress = Codegen.ofNullable(egress);
            return this;
        }
        public Builder egress(DefaultSecurityGroupEgressArgs... egress) {
            return egress(List.of(egress));
        }
        public Builder ingress(@Nullable Output<List<DefaultSecurityGroupIngressArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }
        public Builder ingress(@Nullable List<DefaultSecurityGroupIngressArgs> ingress) {
            this.ingress = Codegen.ofNullable(ingress);
            return this;
        }
        public Builder ingress(DefaultSecurityGroupIngressArgs... ingress) {
            return ingress(List.of(ingress));
        }
        public Builder revokeRulesOnDelete(@Nullable Output<Boolean> revokeRulesOnDelete) {
            this.revokeRulesOnDelete = revokeRulesOnDelete;
            return this;
        }
        public Builder revokeRulesOnDelete(@Nullable Boolean revokeRulesOnDelete) {
            this.revokeRulesOnDelete = Codegen.ofNullable(revokeRulesOnDelete);
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
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public DefaultSecurityGroupArgs build() {
            return new DefaultSecurityGroupArgs(egress, ingress, revokeRulesOnDelete, tags, vpcId);
        }
    }
}
