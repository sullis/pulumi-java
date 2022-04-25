// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MeshSpecEgressFilterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MeshSpecEgressFilterGetArgs Empty = new MeshSpecEgressFilterGetArgs();

    /**
     * The egress filter type. By default, the type is `DROP_ALL`.
     * Valid values are `ALLOW_ALL` and `DROP_ALL`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The egress filter type. By default, the type is `DROP_ALL`.
     * Valid values are `ALLOW_ALL` and `DROP_ALL`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private MeshSpecEgressFilterGetArgs() {}

    private MeshSpecEgressFilterGetArgs(MeshSpecEgressFilterGetArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MeshSpecEgressFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MeshSpecEgressFilterGetArgs $;

        public Builder() {
            $ = new MeshSpecEgressFilterGetArgs();
        }

        public Builder(MeshSpecEgressFilterGetArgs defaults) {
            $ = new MeshSpecEgressFilterGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The egress filter type. By default, the type is `DROP_ALL`.
         * Valid values are `ALLOW_ALL` and `DROP_ALL`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The egress filter type. By default, the type is `DROP_ALL`.
         * Valid values are `ALLOW_ALL` and `DROP_ALL`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MeshSpecEgressFilterGetArgs build() {
            return $;
        }
    }

}
