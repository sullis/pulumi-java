// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.enums.SandboxConfigType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SandboxConfig contains configurations of the sandbox to use for the node.
 * 
 */
public final class SandboxConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SandboxConfigArgs Empty = new SandboxConfigArgs();

    /**
     * Type of the sandbox to use for the node.
     * 
     */
    @Import(name="type")
    private @Nullable Output<SandboxConfigType> type;

    /**
     * @return Type of the sandbox to use for the node.
     * 
     */
    public Optional<Output<SandboxConfigType>> type() {
        return Optional.ofNullable(this.type);
    }

    private SandboxConfigArgs() {}

    private SandboxConfigArgs(SandboxConfigArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SandboxConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SandboxConfigArgs $;

        public Builder() {
            $ = new SandboxConfigArgs();
        }

        public Builder(SandboxConfigArgs defaults) {
            $ = new SandboxConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Type of the sandbox to use for the node.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<SandboxConfigType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the sandbox to use for the node.
         * 
         * @return builder
         * 
         */
        public Builder type(SandboxConfigType type) {
            return type(Output.of(type));
        }

        public SandboxConfigArgs build() {
            return $;
        }
    }

}
