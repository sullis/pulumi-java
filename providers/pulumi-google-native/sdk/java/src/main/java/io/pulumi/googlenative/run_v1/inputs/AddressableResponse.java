// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information for connecting over HTTP(s).
 * 
 */
public final class AddressableResponse extends io.pulumi.resources.InvokeArgs {

    public static final AddressableResponse Empty = new AddressableResponse();

    @InputImport(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public AddressableResponse(String url) {
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private AddressableResponse() {
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public AddressableResponse build() {
            return new AddressableResponse(url);
        }
    }
}