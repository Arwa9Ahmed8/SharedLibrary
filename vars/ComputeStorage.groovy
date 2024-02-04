#!/usr/bin/env groovy
def call() {
sh """
DISK_SIZE_TOTAL=$(df -kh . | tail -n1 | awk '{print $2}')
echo "DISK_SIZE_TOTAL is $DISK_SIZE_TOTAL"
DISK_SIZE_FREE=$(df -kh . | tail -n1 | awk '{print $4}')
echo "DISK_SIZE_FREE is $DISK_SIZE_FREE"
DISK_PERCENT_USED=$(df -kh . | tail -n1 | awk '{print $5}')
echo "DISK_PERCENT_USED is $DISK_PERCENT_USED"
"""
}
