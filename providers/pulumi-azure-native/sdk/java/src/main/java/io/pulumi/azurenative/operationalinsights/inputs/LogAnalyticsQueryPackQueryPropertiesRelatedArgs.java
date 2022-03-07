// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The related metadata items for the function.
 * 
 */
public final class LogAnalyticsQueryPackQueryPropertiesRelatedArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogAnalyticsQueryPackQueryPropertiesRelatedArgs Empty = new LogAnalyticsQueryPackQueryPropertiesRelatedArgs();

    /**
     * The related categories for the function.
     * 
     */
    @InputImport(name="categories")
      private final @Nullable Input<List<String>> categories;

    public Input<List<String>> getCategories() {
        return this.categories == null ? Input.empty() : this.categories;
    }

    /**
     * The related resource types for the function.
     * 
     */
    @InputImport(name="resourceTypes")
      private final @Nullable Input<List<String>> resourceTypes;

    public Input<List<String>> getResourceTypes() {
        return this.resourceTypes == null ? Input.empty() : this.resourceTypes;
    }

    /**
     * The related Log Analytics solutions for the function.
     * 
     */
    @InputImport(name="solutions")
      private final @Nullable Input<List<String>> solutions;

    public Input<List<String>> getSolutions() {
        return this.solutions == null ? Input.empty() : this.solutions;
    }

    public LogAnalyticsQueryPackQueryPropertiesRelatedArgs(
        @Nullable Input<List<String>> categories,
        @Nullable Input<List<String>> resourceTypes,
        @Nullable Input<List<String>> solutions) {
        this.categories = categories;
        this.resourceTypes = resourceTypes;
        this.solutions = solutions;
    }

    private LogAnalyticsQueryPackQueryPropertiesRelatedArgs() {
        this.categories = Input.empty();
        this.resourceTypes = Input.empty();
        this.solutions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsQueryPackQueryPropertiesRelatedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> categories;
        private @Nullable Input<List<String>> resourceTypes;
        private @Nullable Input<List<String>> solutions;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsQueryPackQueryPropertiesRelatedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.solutions = defaults.solutions;
        }

        public Builder setCategories(@Nullable Input<List<String>> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setCategories(@Nullable List<String> categories) {
            this.categories = Input.ofNullable(categories);
            return this;
        }

        public Builder setResourceTypes(@Nullable Input<List<String>> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Builder setResourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = Input.ofNullable(resourceTypes);
            return this;
        }

        public Builder setSolutions(@Nullable Input<List<String>> solutions) {
            this.solutions = solutions;
            return this;
        }

        public Builder setSolutions(@Nullable List<String> solutions) {
            this.solutions = Input.ofNullable(solutions);
            return this;
        }
        public LogAnalyticsQueryPackQueryPropertiesRelatedArgs build() {
            return new LogAnalyticsQueryPackQueryPropertiesRelatedArgs(categories, resourceTypes, solutions);
        }
    }
}