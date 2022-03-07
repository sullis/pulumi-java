// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub;

import io.pulumi.awsnative.resiliencehub.inputs.AppResourceMappingArgs;
import io.pulumi.awsnative.resiliencehub.inputs.AppTagMapArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="appTemplateBody", required=true)
      private final Input<String> appTemplateBody;

    public Input<String> getAppTemplateBody() {
        return this.appTemplateBody;
    }

    /**
     * App description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Amazon Resource Name (ARN) of the Resiliency Policy.
     * 
     */
    @InputImport(name="resiliencyPolicyArn")
      private final @Nullable Input<String> resiliencyPolicyArn;

    public Input<String> getResiliencyPolicyArn() {
        return this.resiliencyPolicyArn == null ? Input.empty() : this.resiliencyPolicyArn;
    }

    /**
     * An array of ResourceMapping objects.
     * 
     */
    @InputImport(name="resourceMappings", required=true)
      private final Input<List<AppResourceMappingArgs>> resourceMappings;

    public Input<List<AppResourceMappingArgs>> getResourceMappings() {
        return this.resourceMappings;
    }

    @InputImport(name="tags")
      private final @Nullable Input<AppTagMapArgs> tags;

    public Input<AppTagMapArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AppArgs(
        Input<String> appTemplateBody,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> resiliencyPolicyArn,
        Input<List<AppResourceMappingArgs>> resourceMappings,
        @Nullable Input<AppTagMapArgs> tags) {
        this.appTemplateBody = Objects.requireNonNull(appTemplateBody, "expected parameter 'appTemplateBody' to be non-null");
        this.description = description;
        this.name = name;
        this.resiliencyPolicyArn = resiliencyPolicyArn;
        this.resourceMappings = Objects.requireNonNull(resourceMappings, "expected parameter 'resourceMappings' to be non-null");
        this.tags = tags;
    }

    private AppArgs() {
        this.appTemplateBody = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.resiliencyPolicyArn = Input.empty();
        this.resourceMappings = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appTemplateBody;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> resiliencyPolicyArn;
        private Input<List<AppResourceMappingArgs>> resourceMappings;
        private @Nullable Input<AppTagMapArgs> tags;

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

        public Builder setAppTemplateBody(Input<String> appTemplateBody) {
            this.appTemplateBody = Objects.requireNonNull(appTemplateBody);
            return this;
        }

        public Builder setAppTemplateBody(String appTemplateBody) {
            this.appTemplateBody = Input.of(Objects.requireNonNull(appTemplateBody));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setResiliencyPolicyArn(@Nullable Input<String> resiliencyPolicyArn) {
            this.resiliencyPolicyArn = resiliencyPolicyArn;
            return this;
        }

        public Builder setResiliencyPolicyArn(@Nullable String resiliencyPolicyArn) {
            this.resiliencyPolicyArn = Input.ofNullable(resiliencyPolicyArn);
            return this;
        }

        public Builder setResourceMappings(Input<List<AppResourceMappingArgs>> resourceMappings) {
            this.resourceMappings = Objects.requireNonNull(resourceMappings);
            return this;
        }

        public Builder setResourceMappings(List<AppResourceMappingArgs> resourceMappings) {
            this.resourceMappings = Input.of(Objects.requireNonNull(resourceMappings));
            return this;
        }

        public Builder setTags(@Nullable Input<AppTagMapArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable AppTagMapArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AppArgs build() {
            return new AppArgs(appTemplateBody, description, name, resiliencyPolicyArn, resourceMappings, tags);
        }
    }
}