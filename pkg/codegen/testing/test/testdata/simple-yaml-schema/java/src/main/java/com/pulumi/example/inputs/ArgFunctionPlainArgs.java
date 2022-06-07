// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.example.Resource;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ArgFunctionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ArgFunctionPlainArgs Empty = new ArgFunctionPlainArgs();

    @Import(name="arg1")
    private @Nullable Resource arg1;

    public Optional<Resource> arg1() {
        return Optional.ofNullable(this.arg1);
    }

    private ArgFunctionPlainArgs() {}

    private ArgFunctionPlainArgs(ArgFunctionPlainArgs $) {
        this.arg1 = $.arg1;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArgFunctionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArgFunctionPlainArgs $;

        public Builder() {
            $ = new ArgFunctionPlainArgs();
        }

        public Builder(ArgFunctionPlainArgs defaults) {
            $ = new ArgFunctionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder arg1(@Nullable Resource arg1) {
            $.arg1 = arg1;
            return this;
        }

        public ArgFunctionPlainArgs build() {
            return $;
        }
    }

}
