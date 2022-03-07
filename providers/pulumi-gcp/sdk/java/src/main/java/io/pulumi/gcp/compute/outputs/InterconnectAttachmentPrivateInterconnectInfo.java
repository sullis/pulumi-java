// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InterconnectAttachmentPrivateInterconnectInfo {
    private final @Nullable Integer tag8021q;

    @OutputCustomType.Constructor({"tag8021q"})
    private InterconnectAttachmentPrivateInterconnectInfo(@Nullable Integer tag8021q) {
        this.tag8021q = tag8021q;
    }

    public Optional<Integer> getTag8021q() {
        return Optional.ofNullable(this.tag8021q);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectAttachmentPrivateInterconnectInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer tag8021q;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectAttachmentPrivateInterconnectInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tag8021q = defaults.tag8021q;
        }

        public Builder setTag8021q(@Nullable Integer tag8021q) {
            this.tag8021q = tag8021q;
            return this;
        }
        public InterconnectAttachmentPrivateInterconnectInfo build() {
            return new InterconnectAttachmentPrivateInterconnectInfo(tag8021q);
        }
    }
}