// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * If provided, i18n rewrites are enabled.
 * 
 */
public final class I18nConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final I18nConfigResponse Empty = new I18nConfigResponse();

    /**
     * The user-supplied path where country and language specific content will be looked for within the public directory.
     * 
     */
    @InputImport(name="root", required=true)
      private final String root;

    public String getRoot() {
        return this.root;
    }

    public I18nConfigResponse(String root) {
        this.root = Objects.requireNonNull(root, "expected parameter 'root' to be non-null");
    }

    private I18nConfigResponse() {
        this.root = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(I18nConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String root;

        public Builder() {
    	      // Empty
        }

        public Builder(I18nConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.root = defaults.root;
        }

        public Builder setRoot(String root) {
            this.root = Objects.requireNonNull(root);
            return this;
        }
        public I18nConfigResponse build() {
            return new I18nConfigResponse(root);
        }
    }
}