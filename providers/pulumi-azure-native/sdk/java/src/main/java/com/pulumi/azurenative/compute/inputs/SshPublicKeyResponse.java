// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about SSH certificate public key and the path on the Linux VM where the public key is placed.
 * 
 */
public final class SshPublicKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final SshPublicKeyResponse Empty = new SshPublicKeyResponse();

    /**
     * SSH public key certificate used to authenticate with the VM through ssh. The key needs to be at least 2048-bit and in ssh-rsa format. &lt;br&gt;&lt;br&gt; For creating ssh keys, see [Create SSH keys on Linux and Mac for Linux VMs in Azure]https://docs.microsoft.com/azure/virtual-machines/linux/create-ssh-keys-detailed).
     * 
     */
    @Import(name="keyData")
    private @Nullable String keyData;

    /**
     * @return SSH public key certificate used to authenticate with the VM through ssh. The key needs to be at least 2048-bit and in ssh-rsa format. &lt;br&gt;&lt;br&gt; For creating ssh keys, see [Create SSH keys on Linux and Mac for Linux VMs in Azure]https://docs.microsoft.com/azure/virtual-machines/linux/create-ssh-keys-detailed).
     * 
     */
    public Optional<String> keyData() {
        return Optional.ofNullable(this.keyData);
    }

    /**
     * Specifies the full path on the created VM where ssh public key is stored. If the file already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys
     * 
     */
    @Import(name="path")
    private @Nullable String path;

    /**
     * @return Specifies the full path on the created VM where ssh public key is stored. If the file already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    private SshPublicKeyResponse() {}

    private SshPublicKeyResponse(SshPublicKeyResponse $) {
        this.keyData = $.keyData;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshPublicKeyResponse $;

        public Builder() {
            $ = new SshPublicKeyResponse();
        }

        public Builder(SshPublicKeyResponse defaults) {
            $ = new SshPublicKeyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyData SSH public key certificate used to authenticate with the VM through ssh. The key needs to be at least 2048-bit and in ssh-rsa format. &lt;br&gt;&lt;br&gt; For creating ssh keys, see [Create SSH keys on Linux and Mac for Linux VMs in Azure]https://docs.microsoft.com/azure/virtual-machines/linux/create-ssh-keys-detailed).
         * 
         * @return builder
         * 
         */
        public Builder keyData(@Nullable String keyData) {
            $.keyData = keyData;
            return this;
        }

        /**
         * @param path Specifies the full path on the created VM where ssh public key is stored. If the file already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable String path) {
            $.path = path;
            return this;
        }

        public SshPublicKeyResponse build() {
            return $;
        }
    }

}
