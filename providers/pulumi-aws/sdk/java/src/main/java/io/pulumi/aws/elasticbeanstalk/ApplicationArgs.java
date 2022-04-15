// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk;

import io.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    @Import(name="appversionLifecycle")
      private final @Nullable Output<ApplicationAppversionLifecycleArgs> appversionLifecycle;

    public Output<ApplicationAppversionLifecycleArgs> appversionLifecycle() {
        return this.appversionLifecycle == null ? Codegen.empty() : this.appversionLifecycle;
    }

    /**
     * Short description of the application
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the application, must be unique within your account
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Key-value map of tags for the Elastic Beanstalk Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ApplicationArgs(
        @Nullable Output<ApplicationAppversionLifecycleArgs> appversionLifecycle,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.appversionLifecycle = appversionLifecycle;
        this.description = description;
        this.name = name;
        this.tags = tags;
    }

    private ApplicationArgs() {
        this.appversionLifecycle = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationAppversionLifecycleArgs> appversionLifecycle;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appversionLifecycle = defaults.appversionLifecycle;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder appversionLifecycle(@Nullable Output<ApplicationAppversionLifecycleArgs> appversionLifecycle) {
            this.appversionLifecycle = appversionLifecycle;
            return this;
        }
        public Builder appversionLifecycle(@Nullable ApplicationAppversionLifecycleArgs appversionLifecycle) {
            this.appversionLifecycle = Codegen.ofNullable(appversionLifecycle);
            return this;
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ApplicationArgs build() {
            return new ApplicationArgs(appversionLifecycle, description, name, tags);
        }
    }
}
