// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub;

import io.pulumi.awsnative.resiliencehub.inputs.AppResourceMappingArgs;
import io.pulumi.awsnative.resiliencehub.inputs.AppTagMapArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * A string containing full ResilienceHub app template body.
     * 
     */
    @Import(name="appTemplateBody", required=true)
      private final Output<String> appTemplateBody;

    public Output<String> getAppTemplateBody() {
        return this.appTemplateBody;
    }

    /**
     * App description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Amazon Resource Name (ARN) of the Resiliency Policy.
     * 
     */
    @Import(name="resiliencyPolicyArn")
      private final @Nullable Output<String> resiliencyPolicyArn;

    public Output<String> getResiliencyPolicyArn() {
        return this.resiliencyPolicyArn == null ? Output.empty() : this.resiliencyPolicyArn;
    }

    /**
     * An array of ResourceMapping objects.
     * 
     */
    @Import(name="resourceMappings", required=true)
      private final Output<List<AppResourceMappingArgs>> resourceMappings;

    public Output<List<AppResourceMappingArgs>> getResourceMappings() {
        return this.resourceMappings;
    }

    @Import(name="tags")
      private final @Nullable Output<AppTagMapArgs> tags;

    public Output<AppTagMapArgs> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public AppArgs(
        Output<String> appTemplateBody,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> resiliencyPolicyArn,
        Output<List<AppResourceMappingArgs>> resourceMappings,
        @Nullable Output<AppTagMapArgs> tags) {
        this.appTemplateBody = Objects.requireNonNull(appTemplateBody, "expected parameter 'appTemplateBody' to be non-null");
        this.description = description;
        this.name = name;
        this.resiliencyPolicyArn = resiliencyPolicyArn;
        this.resourceMappings = Objects.requireNonNull(resourceMappings, "expected parameter 'resourceMappings' to be non-null");
        this.tags = tags;
    }

    private AppArgs() {
        this.appTemplateBody = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.resiliencyPolicyArn = Output.empty();
        this.resourceMappings = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appTemplateBody;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> resiliencyPolicyArn;
        private Output<List<AppResourceMappingArgs>> resourceMappings;
        private @Nullable Output<AppTagMapArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appTemplateBody = defaults.appTemplateBody;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.resiliencyPolicyArn = defaults.resiliencyPolicyArn;
    	      this.resourceMappings = defaults.resourceMappings;
    	      this.tags = defaults.tags;
        }

        public Builder appTemplateBody(Output<String> appTemplateBody) {
            this.appTemplateBody = Objects.requireNonNull(appTemplateBody);
            return this;
        }
        public Builder appTemplateBody(String appTemplateBody) {
            this.appTemplateBody = Output.of(Objects.requireNonNull(appTemplateBody));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder resiliencyPolicyArn(@Nullable Output<String> resiliencyPolicyArn) {
            this.resiliencyPolicyArn = resiliencyPolicyArn;
            return this;
        }
        public Builder resiliencyPolicyArn(@Nullable String resiliencyPolicyArn) {
            this.resiliencyPolicyArn = Output.ofNullable(resiliencyPolicyArn);
            return this;
        }
        public Builder resourceMappings(Output<List<AppResourceMappingArgs>> resourceMappings) {
            this.resourceMappings = Objects.requireNonNull(resourceMappings);
            return this;
        }
        public Builder resourceMappings(List<AppResourceMappingArgs> resourceMappings) {
            this.resourceMappings = Output.of(Objects.requireNonNull(resourceMappings));
            return this;
        }
        public Builder resourceMappings(AppResourceMappingArgs... resourceMappings) {
            return resourceMappings(List.of(resourceMappings));
        }
        public Builder tags(@Nullable Output<AppTagMapArgs> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable AppTagMapArgs tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public AppArgs build() {
            return new AppArgs(appTemplateBody, description, name, resiliencyPolicyArn, resourceMappings, tags);
        }
    }
}
