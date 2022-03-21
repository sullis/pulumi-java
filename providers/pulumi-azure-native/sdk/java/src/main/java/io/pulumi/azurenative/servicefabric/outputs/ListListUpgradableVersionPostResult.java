// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListListUpgradableVersionPostResult {
    private final @Nullable List<String> supportedPath;

    @CustomType.Constructor
    private ListListUpgradableVersionPostResult(@CustomType.Parameter("supportedPath") @Nullable List<String> supportedPath) {
        this.supportedPath = supportedPath;
    }

    public List<String> getSupportedPath() {
        return this.supportedPath == null ? List.of() : this.supportedPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListListUpgradableVersionPostResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> supportedPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ListListUpgradableVersionPostResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.supportedPath = defaults.supportedPath;
        }

        public Builder supportedPath(@Nullable List<String> supportedPath) {
            this.supportedPath = supportedPath;
            return this;
        }
        public Builder supportedPath(String... supportedPath) {
            return supportedPath(List.of(supportedPath));
        }        public ListListUpgradableVersionPostResult build() {
            return new ListListUpgradableVersionPostResult(supportedPath);
        }
    }
}
