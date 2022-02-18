// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticIpArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticIpArgs Empty = new StaticIpArgs();

    /**
     * The instance where the static IP is attached.
     * 
     */
    @InputImport(name="attachedTo")
    private final @Nullable Input<String> attachedTo;

    public Input<String> getAttachedTo() {
        return this.attachedTo == null ? Input.empty() : this.attachedTo;
    }

    /**
     * The name of the static IP address.
     * 
     */
    @InputImport(name="staticIpName")
    private final @Nullable Input<String> staticIpName;

    public Input<String> getStaticIpName() {
        return this.staticIpName == null ? Input.empty() : this.staticIpName;
    }

    public StaticIpArgs(
        @Nullable Input<String> attachedTo,
        @Nullable Input<String> staticIpName) {
        this.attachedTo = attachedTo;
        this.staticIpName = staticIpName;
    }

    private StaticIpArgs() {
        this.attachedTo = Input.empty();
        this.staticIpName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attachedTo;
        private @Nullable Input<String> staticIpName;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticIpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedTo = defaults.attachedTo;
    	      this.staticIpName = defaults.staticIpName;
        }

        public Builder setAttachedTo(@Nullable Input<String> attachedTo) {
            this.attachedTo = attachedTo;
            return this;
        }

        public Builder setAttachedTo(@Nullable String attachedTo) {
            this.attachedTo = Input.ofNullable(attachedTo);
            return this;
        }

        public Builder setStaticIpName(@Nullable Input<String> staticIpName) {
            this.staticIpName = staticIpName;
            return this;
        }

        public Builder setStaticIpName(@Nullable String staticIpName) {
            this.staticIpName = Input.ofNullable(staticIpName);
            return this;
        }

        public StaticIpArgs build() {
            return new StaticIpArgs(attachedTo, staticIpName);
        }
    }
}
