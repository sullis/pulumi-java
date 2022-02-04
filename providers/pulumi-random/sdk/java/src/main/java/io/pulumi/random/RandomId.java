// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.random.Utilities;
import io.pulumi.random.inputs.*;

@ResourceType(type="random:index/randomId:RandomId")
public class RandomId extends io.pulumi.resources.CustomResource {
    @OutputExport(name="b64Std", type=String.class, parameters={})
    private Output<String> b64Std;

    public Output<String> getB64Std() {
        return this.b64Std;
    }
    @OutputExport(name="b64Url", type=String.class, parameters={})
    private Output<String> b64Url;

    public Output<String> getB64Url() {
        return this.b64Url;
    }
    @OutputExport(name="byteLength", type=Integer.class, parameters={})
    private Output<Integer> byteLength;

    public Output<Integer> getByteLength() {
        return this.byteLength;
    }
    @OutputExport(name="dec", type=String.class, parameters={})
    private Output<String> dec;

    public Output<String> getDec() {
        return this.dec;
    }
    @OutputExport(name="hex", type=String.class, parameters={})
    private Output<String> hex;

    public Output<String> getHex() {
        return this.hex;
    }
    @OutputExport(name="keepers", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> keepers;

    public Output</* @Nullable */ Map<String,Object>> getKeepers() {
        return this.keepers;
    }
    @OutputExport(name="prefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefix;

    public Output</* @Nullable */ String> getPrefix() {
        return this.prefix;
    }

    public RandomId(String name, RandomIdArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomId:RandomId", name, args == null ? RandomIdArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RandomId(String name, Input<String> id, @Nullable RandomIdState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomId:RandomId", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RandomId get(String name, Input<String> id, @Nullable RandomIdState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RandomId(name, id, state, options);
    }
}
