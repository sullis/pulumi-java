// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm;

import io.pulumi.awsnative.devicefarm.inputs.TestGridProjectTagArgs;
import io.pulumi.awsnative.devicefarm.inputs.TestGridProjectVpcConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TestGridProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final TestGridProjectArgs Empty = new TestGridProjectArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="tags")
      private final @Nullable Output<List<TestGridProjectTagArgs>> tags;

    public Output<List<TestGridProjectTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="vpcConfig")
      private final @Nullable Output<TestGridProjectVpcConfigArgs> vpcConfig;

    public Output<TestGridProjectVpcConfigArgs> vpcConfig() {
        return this.vpcConfig == null ? Codegen.empty() : this.vpcConfig;
    }

    public TestGridProjectArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<TestGridProjectTagArgs>> tags,
        @Nullable Output<TestGridProjectVpcConfigArgs> vpcConfig) {
        this.description = description;
        this.name = name;
        this.tags = tags;
        this.vpcConfig = vpcConfig;
    }

    private TestGridProjectArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestGridProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<TestGridProjectTagArgs>> tags;
        private @Nullable Output<TestGridProjectVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(TestGridProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder tags(@Nullable Output<List<TestGridProjectTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<TestGridProjectTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(TestGridProjectTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder vpcConfig(@Nullable Output<TestGridProjectVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable TestGridProjectVpcConfigArgs vpcConfig) {
            this.vpcConfig = Codegen.ofNullable(vpcConfig);
            return this;
        }        public TestGridProjectArgs build() {
            return new TestGridProjectArgs(description, name, tags, vpcConfig);
        }
    }
}
