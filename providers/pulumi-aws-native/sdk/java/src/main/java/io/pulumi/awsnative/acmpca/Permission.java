// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.acmpca.PermissionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:acmpca:Permission")
public class Permission extends io.pulumi.resources.CustomResource {
    @OutputExport(name="actions", type=List.class, parameters={String.class})
    private Output<List<String>> actions;

    public Output<List<String>> getActions() {
        return this.actions;
    }
    @OutputExport(name="certificateAuthorityArn", type=String.class, parameters={})
    private Output<String> certificateAuthorityArn;

    public Output<String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }
    @OutputExport(name="principal", type=String.class, parameters={})
    private Output<String> principal;

    public Output<String> getPrincipal() {
        return this.principal;
    }
    @OutputExport(name="sourceAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceAccount;

    public Output</* @Nullable */ String> getSourceAccount() {
        return this.sourceAccount;
    }

    public Permission(String name, PermissionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:acmpca:Permission", name, args == null ? PermissionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Permission(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:acmpca:Permission", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Permission get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Permission(name, id, options);
    }
}
