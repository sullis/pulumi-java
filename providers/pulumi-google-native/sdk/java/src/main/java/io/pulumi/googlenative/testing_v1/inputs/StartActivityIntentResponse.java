// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A starting intent specified by an action, uri, and categories.
 * 
 */
public final class StartActivityIntentResponse extends io.pulumi.resources.InvokeArgs {

    public static final StartActivityIntentResponse Empty = new StartActivityIntentResponse();

    /**
     * Action name. Required for START_ACTIVITY.
     * 
     */
    @Import(name="action", required=true)
      private final String action;

    public String getAction() {
        return this.action;
    }

    /**
     * Intent categories to set on the intent.
     * 
     */
    @Import(name="categories", required=true)
      private final List<String> categories;

    public List<String> getCategories() {
        return this.categories;
    }

    /**
     * URI for the action.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public StartActivityIntentResponse(
        String action,
        List<String> categories,
        String uri) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.categories = Objects.requireNonNull(categories, "expected parameter 'categories' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private StartActivityIntentResponse() {
        this.action = null;
        this.categories = List.of();
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StartActivityIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<String> categories;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(StartActivityIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.categories = defaults.categories;
    	      this.uri = defaults.uri;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder categories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public StartActivityIntentResponse build() {
            return new StartActivityIntentResponse(action, categories, uri);
        }
    }
}
