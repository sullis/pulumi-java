// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAzsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAzsArgs Empty = new GetAzsArgs();

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GetAzsArgs() {}

    private GetAzsArgs(GetAzsArgs $) {
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAzsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAzsArgs $;

        public Builder() {
            $ = new GetAzsArgs();
        }

        public Builder(GetAzsArgs defaults) {
            $ = new GetAzsArgs(Objects.requireNonNull(defaults));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetAzsArgs build() {
            return $;
        }
    }

}
