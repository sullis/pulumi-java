// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.azurenative.azurearcdata.enums.PostgresInstanceSkuTier;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The resource model definition representing SKU for Azure Database for PostgresSQL - Azure Arc
 * 
 */
public final class PostgresInstanceSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final PostgresInstanceSkuArgs Empty = new PostgresInstanceSkuArgs();

    /**
     * If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Whether dev/test is enabled. When the dev field is set to true, the resource is used for dev/test purpose.
     * 
     */
    @Import(name="dev")
    private @Nullable Output<Boolean> dev;

    /**
     * @return Whether dev/test is enabled. When the dev field is set to true, the resource is used for dev/test purpose.
     * 
     */
    public Optional<Output<Boolean>> dev() {
        return Optional.ofNullable(this.dev);
    }

    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    /**
     * @return If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The name of the SKU.  It is typically a letter+number code
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the SKU.  It is typically a letter+number code
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * This field is required to be implemented by the Resource Provider if the service has more than one tier.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<PostgresInstanceSkuTier> tier;

    /**
     * @return This field is required to be implemented by the Resource Provider if the service has more than one tier.
     * 
     */
    public Optional<Output<PostgresInstanceSkuTier>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private PostgresInstanceSkuArgs() {}

    private PostgresInstanceSkuArgs(PostgresInstanceSkuArgs $) {
        this.capacity = $.capacity;
        this.dev = $.dev;
        this.family = $.family;
        this.name = $.name;
        this.size = $.size;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PostgresInstanceSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostgresInstanceSkuArgs $;

        public Builder() {
            $ = new PostgresInstanceSkuArgs();
        }

        public Builder(PostgresInstanceSkuArgs defaults) {
            $ = new PostgresInstanceSkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param dev Whether dev/test is enabled. When the dev field is set to true, the resource is used for dev/test purpose.
         * 
         * @return builder
         * 
         */
        public Builder dev(@Nullable Output<Boolean> dev) {
            $.dev = dev;
            return this;
        }

        /**
         * @param dev Whether dev/test is enabled. When the dev field is set to true, the resource is used for dev/test purpose.
         * 
         * @return builder
         * 
         */
        public Builder dev(Boolean dev) {
            return dev(Output.of(dev));
        }

        /**
         * @param family If the service has different generations of hardware, for the same SKU, then that can be captured here.
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family If the service has different generations of hardware, for the same SKU, then that can be captured here.
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param name The name of the SKU.  It is typically a letter+number code
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SKU.  It is typically a letter+number code
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param size The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param tier This field is required to be implemented by the Resource Provider if the service has more than one tier.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<PostgresInstanceSkuTier> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier This field is required to be implemented by the Resource Provider if the service has more than one tier.
         * 
         * @return builder
         * 
         */
        public Builder tier(PostgresInstanceSkuTier tier) {
            return tier(Output.of(tier));
        }

        public PostgresInstanceSkuArgs build() {
            $.dev = Codegen.booleanProp("dev").output().arg($.dev).def(true).getNullable();
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.tier = Codegen.objectProp("tier", PostgresInstanceSkuTier.class).output().arg($.tier).def(PostgresInstanceSkuTier.Hyperscale).getNullable();
            return $;
        }
    }

}
