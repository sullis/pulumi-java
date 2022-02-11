// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iam.ServerCertificateArgs;
import io.pulumi.awsnative.iam.outputs.ServerCertificateTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:iam:ServerCertificate")
public class ServerCertificate extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="certificateBody", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateBody;

    public Output</* @Nullable */ String> getCertificateBody() {
        return this.certificateBody;
    }
    @OutputExport(name="certificateChain", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateChain;

    public Output</* @Nullable */ String> getCertificateChain() {
        return this.certificateChain;
    }
    @OutputExport(name="path", type=String.class, parameters={})
    private Output</* @Nullable */ String> path;

    public Output</* @Nullable */ String> getPath() {
        return this.path;
    }
    @OutputExport(name="privateKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateKey;

    public Output</* @Nullable */ String> getPrivateKey() {
        return this.privateKey;
    }
    @OutputExport(name="serverCertificateName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverCertificateName;

    public Output</* @Nullable */ String> getServerCertificateName() {
        return this.serverCertificateName;
    }
    @OutputExport(name="tags", type=List.class, parameters={ServerCertificateTag.class})
    private Output</* @Nullable */ List<ServerCertificateTag>> tags;

    public Output</* @Nullable */ List<ServerCertificateTag>> getTags() {
        return this.tags;
    }

    public ServerCertificate(String name, @Nullable ServerCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iam:ServerCertificate", name, args == null ? ServerCertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServerCertificate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iam:ServerCertificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ServerCertificate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerCertificate(name, id, options);
    }
}
