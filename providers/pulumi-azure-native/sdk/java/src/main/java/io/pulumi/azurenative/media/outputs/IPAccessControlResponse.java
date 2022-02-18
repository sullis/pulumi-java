// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.IPRangeResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class IPAccessControlResponse {
    /**
     * The IP allow list.
     * 
     */
    private final @Nullable List<IPRangeResponse> allow;

    @OutputCustomType.Constructor({"allow"})
    private IPAccessControlResponse(@Nullable List<IPRangeResponse> allow) {
        this.allow = allow;
    }

    /**
     * The IP allow list.
     * 
     */
    public List<IPRangeResponse> getAllow() {
        return this.allow == null ? List.of() : this.allow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAccessControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IPRangeResponse> allow;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAccessControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
        }

        public Builder setAllow(@Nullable List<IPRangeResponse> allow) {
            this.allow = allow;
            return this;
        }

        public IPAccessControlResponse build() {
            return new IPAccessControlResponse(allow);
        }
    }
}
