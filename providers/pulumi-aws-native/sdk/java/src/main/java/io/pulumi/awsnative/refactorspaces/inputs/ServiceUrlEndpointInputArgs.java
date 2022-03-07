// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceUrlEndpointInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceUrlEndpointInputArgs Empty = new ServiceUrlEndpointInputArgs();

    @InputImport(name="healthUrl")
      private final @Nullable Input<String> healthUrl;

    public Input<String> getHealthUrl() {
        return this.healthUrl == null ? Input.empty() : this.healthUrl;
    }

    @InputImport(name="url", required=true)
      private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    public ServiceUrlEndpointInputArgs(
        @Nullable Input<String> healthUrl,
        Input<String> url) {
        this.healthUrl = healthUrl;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private ServiceUrlEndpointInputArgs() {
        this.healthUrl = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUrlEndpointInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> healthUrl;
        private Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUrlEndpointInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthUrl = defaults.healthUrl;
    	      this.url = defaults.url;
        }

        public Builder setHealthUrl(@Nullable Input<String> healthUrl) {
            this.healthUrl = healthUrl;
            return this;
        }

        public Builder setHealthUrl(@Nullable String healthUrl) {
            this.healthUrl = Input.ofNullable(healthUrl);
            return this;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }
        public ServiceUrlEndpointInputArgs build() {
            return new ServiceUrlEndpointInputArgs(healthUrl, url);
        }
    }
}