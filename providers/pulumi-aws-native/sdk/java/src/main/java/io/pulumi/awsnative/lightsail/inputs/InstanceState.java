// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Current State of the Instance.
 * 
 */
public final class InstanceState extends io.pulumi.resources.InvokeArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * Status code of the Instance.
     * 
     */
    @Import(name="code")
      private final @Nullable Integer code;

    public Optional<Integer> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * Status code of the Instance.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public InstanceState(
        @Nullable Integer code,
        @Nullable String name) {
        this.code = code;
        this.name = name;
    }

    private InstanceState() {
        this.code = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.name = defaults.name;
        }

        public Builder code(@Nullable Integer code) {
            this.code = code;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public InstanceState build() {
            return new InstanceState(code, name);
        }
    }
}
