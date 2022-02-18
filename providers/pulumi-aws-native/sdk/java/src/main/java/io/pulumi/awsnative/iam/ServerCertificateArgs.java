// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.iam.inputs.ServerCertificateTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerCertificateArgs Empty = new ServerCertificateArgs();

    @InputImport(name="certificateBody")
    private final @Nullable Input<String> certificateBody;

    public Input<String> getCertificateBody() {
        return this.certificateBody == null ? Input.empty() : this.certificateBody;
    }

    @InputImport(name="certificateChain")
    private final @Nullable Input<String> certificateChain;

    public Input<String> getCertificateChain() {
        return this.certificateChain == null ? Input.empty() : this.certificateChain;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="privateKey")
    private final @Nullable Input<String> privateKey;

    public Input<String> getPrivateKey() {
        return this.privateKey == null ? Input.empty() : this.privateKey;
    }

    @InputImport(name="serverCertificateName")
    private final @Nullable Input<String> serverCertificateName;

    public Input<String> getServerCertificateName() {
        return this.serverCertificateName == null ? Input.empty() : this.serverCertificateName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<ServerCertificateTagArgs>> tags;

    public Input<List<ServerCertificateTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ServerCertificateArgs(
        @Nullable Input<String> certificateBody,
        @Nullable Input<String> certificateChain,
        @Nullable Input<String> path,
        @Nullable Input<String> privateKey,
        @Nullable Input<String> serverCertificateName,
        @Nullable Input<List<ServerCertificateTagArgs>> tags) {
        this.certificateBody = certificateBody;
        this.certificateChain = certificateChain;
        this.path = path;
        this.privateKey = privateKey;
        this.serverCertificateName = serverCertificateName;
        this.tags = tags;
    }

    private ServerCertificateArgs() {
        this.certificateBody = Input.empty();
        this.certificateChain = Input.empty();
        this.path = Input.empty();
        this.privateKey = Input.empty();
        this.serverCertificateName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateBody;
        private @Nullable Input<String> certificateChain;
        private @Nullable Input<String> path;
        private @Nullable Input<String> privateKey;
        private @Nullable Input<String> serverCertificateName;
        private @Nullable Input<List<ServerCertificateTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateBody = defaults.certificateBody;
    	      this.certificateChain = defaults.certificateChain;
    	      this.path = defaults.path;
    	      this.privateKey = defaults.privateKey;
    	      this.serverCertificateName = defaults.serverCertificateName;
    	      this.tags = defaults.tags;
        }

        public Builder setCertificateBody(@Nullable Input<String> certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }

        public Builder setCertificateBody(@Nullable String certificateBody) {
            this.certificateBody = Input.ofNullable(certificateBody);
            return this;
        }

        public Builder setCertificateChain(@Nullable Input<String> certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        public Builder setCertificateChain(@Nullable String certificateChain) {
            this.certificateChain = Input.ofNullable(certificateChain);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPrivateKey(@Nullable Input<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder setPrivateKey(@Nullable String privateKey) {
            this.privateKey = Input.ofNullable(privateKey);
            return this;
        }

        public Builder setServerCertificateName(@Nullable Input<String> serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
            return this;
        }

        public Builder setServerCertificateName(@Nullable String serverCertificateName) {
            this.serverCertificateName = Input.ofNullable(serverCertificateName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ServerCertificateTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ServerCertificateTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ServerCertificateArgs build() {
            return new ServerCertificateArgs(certificateBody, certificateChain, path, privateKey, serverCertificateName, tags);
        }
    }
}
