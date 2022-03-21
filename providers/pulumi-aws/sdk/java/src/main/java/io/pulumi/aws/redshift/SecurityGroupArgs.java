// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.aws.redshift.inputs.SecurityGroupIngressArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityGroupArgs Empty = new SecurityGroupArgs();

    /**
     * The description of the Redshift security group. Defaults to "Managed by Pulumi".
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A list of ingress rules.
     * 
     */
    @Import(name="ingress", required=true)
      private final Output<List<SecurityGroupIngressArgs>> ingress;

    public Output<List<SecurityGroupIngressArgs>> getIngress() {
        return this.ingress;
    }

    /**
     * The name of the Redshift security group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public SecurityGroupArgs(
        @Nullable Output<String> description,
        Output<List<SecurityGroupIngressArgs>> ingress,
        @Nullable Output<String> name) {
        this.description = description == null ? Output.ofNullable("Managed by Pulumi") : description;
        this.ingress = Objects.requireNonNull(ingress, "expected parameter 'ingress' to be non-null");
        this.name = name;
    }

    private SecurityGroupArgs() {
        this.description = Output.empty();
        this.ingress = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<SecurityGroupIngressArgs>> ingress;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ingress = defaults.ingress;
    	      this.name = defaults.name;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder ingress(Output<List<SecurityGroupIngressArgs>> ingress) {
            this.ingress = Objects.requireNonNull(ingress);
            return this;
        }
        public Builder ingress(List<SecurityGroupIngressArgs> ingress) {
            this.ingress = Output.of(Objects.requireNonNull(ingress));
            return this;
        }
        public Builder ingress(SecurityGroupIngressArgs... ingress) {
            return ingress(List.of(ingress));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public SecurityGroupArgs build() {
            return new SecurityGroupArgs(description, ingress, name);
        }
    }
}
