// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDeploymentLogFileUrlResult {
    /**
     * URL of the log file
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"url"})
    private GetDeploymentLogFileUrlResult(String url) {
        this.url = Objects.requireNonNull(url);
    }

    /**
     * URL of the log file
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentLogFileUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentLogFileUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public GetDeploymentLogFileUrlResult build() {
            return new GetDeploymentLogFileUrlResult(url);
        }
    }
}
