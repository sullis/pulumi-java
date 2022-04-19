// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.aws.redshift.inputs.SecurityGroupIngressGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityGroupState extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGroupState Empty = new SecurityGroupState();

    /**
     * The description of the Redshift security group. Defaults to "Managed by Pulumi".
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A list of ingress rules.
     * 
     */
    @Import(name="ingress")
      private final @Nullable Output<List<SecurityGroupIngressGetArgs>> ingress;

    public Output<List<SecurityGroupIngressGetArgs>> ingress() {
        return this.ingress == null ? Codegen.empty() : this.ingress;
    }

    /**
     * The name of the Redshift security group.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public SecurityGroupState(
        @Nullable Output<String> description,
        @Nullable Output<List<SecurityGroupIngressGetArgs>> ingress,
        @Nullable Output<String> name) {
        this.description = Codegen.stringProp("description").output().arg(description).def("Managed by Pulumi").getNullable();
        this.ingress = ingress;
        this.name = name;
    }

    private SecurityGroupState() {
        this.description = Codegen.empty();
        this.ingress = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<SecurityGroupIngressGetArgs>> ingress;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupState defaults) {
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
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ingress(@Nullable Output<List<SecurityGroupIngressGetArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }
        public Builder ingress(@Nullable List<SecurityGroupIngressGetArgs> ingress) {
            this.ingress = Codegen.ofNullable(ingress);
            return this;
        }
        public Builder ingress(SecurityGroupIngressGetArgs... ingress) {
            return ingress(List.of(ingress));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public SecurityGroupState build() {
            return new SecurityGroupState(description, ingress, name);
        }
    }
}
